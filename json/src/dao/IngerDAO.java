package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBCon;
import vo.IngerInfo;

public class IngerDAO {
     public List<IngerInfo> selectIngerInfoList(){
    	 Connection con = DBCon.getCon();
    	 String sql = "select * from Inger";
    	 List<IngerInfo> igList = new ArrayList<IngerInfo>();
    	 try {
    		 PreparedStatement ps = con.prepareStatement(sql);
    		 ResultSet rs = ps.executeQuery();
    		 while(rs.next())
    	 }
     }
}
