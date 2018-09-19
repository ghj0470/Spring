package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBCon;
import vo.MemberInfo;

public class MemberDAO {
	public List<MemberInfo> selectMemberInfoList(){
         Connection con = DBCon.getCon();
         String sql = "select * from member_info";
         List<MemberInfo> miList =new ArrayList<MemberInfo>();
         try {
        	 PreparedStatement ps = con.prepareStatement(sql);
        	 ResultSet rs = ps.executeQuery();
        	 while(rs.next()) {
        		 MemberInfo mi = new MemberInfo(rs.getInt("mino"),rs.getString("miid"),rs.getString("mipwd"),rs.getInt("dino"),
        				 rs.getString("miemail"),rs.getString("mietc"),rs.getString("credat"),rs.getString("cretim"),
        				 rs.getInt("creusr"),rs.getString("moddat"),rs.getString("modtim"),rs.getInt("modusr"),rs.getInt("lvl"), rs.getString("miname"));
        				 miList.add(mi);
        	 }
        	 ps.close();
        	 rs.close();
         }catch(SQLException e) {
        	 e.printStackTrace();
         }finally {
        	 DBCon.close();
         }
         return miList;
}
}