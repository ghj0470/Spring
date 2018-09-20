package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBCon;
import vo.Ticket;

public class TicketDAO {

	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;

	private void close() throws SQLException {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		} finally {
			DBCon.close();
		}
	}

	public List<Ticket> selectTicketList(Ticket ti) {
		List<Ticket> ticketList = new ArrayList<Ticket>();
		Connection con = DBCon.getCon();
		try {
			String sql = "select * from ticket_movie";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				ti = new Ticket(rs.getInt("tmnum"), rs.getString("tmname"), rs.getInt("tmprice"),
						rs.getString("tmstartdat"), rs.getString("tmenddat"), rs.getString("tmcredat"),
						rs.getString("tmdesc"), rs.getInt("tmcnt"), rs.getString("tmimg"));
				ticketList.add(ti);
			}
			return ticketList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return null;
	}

	public Ticket selectTicket(Ticket ti) {
		Connection con = DBCon.getCon();
		try {
			String sql = "select * from ticket_movie";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				ti = new Ticket(rs.getInt("tmnum"), rs.getString("tmname"), rs.getInt("tmprice"),
						rs.getString("tmstartdat"), rs.getString("tmenddat"), rs.getString("tmcredat"),
						rs.getString("tmdesc"), rs.getInt("tmcnt"), rs.getString("tmimg"));
				return ti;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return null;
	}

	public int insertTicket(Ticket ti) throws SQLException {
		Connection con = DBCon.getCon();
		String sql = "insert into ticket_movie(tmnum,tmname,tmprice" + "tmstartdat, \r\n"
				+ "tmenddat, tmcredat,tmdesc,tmimg)\r\n" + "values(seq_tmNum.nextval,?,?,?,?,"
				+ "to_char(sysdate,'YYYYMMDD'),?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, ti.getTmname());
			ps.setInt(2, ti.getTmprice());
			ps.setString(3, ti.getTmstartdat());
			ps.setString(4, ti.getTmenddat());
			ps.setString(5, ti.getTmdesc());
			ps.setString(6, ti.getTmimg());
			return ps.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			close();
		}

	}

	public int updateTicket(Ticket ti) throws SQLException {
		String sql = "update ticket_movie set \r\n"+
				"tmName=?,\r\n " +
				"tmPrice=?,\r\n " +
				"tmStartdat=?,\r\n" +
				"tmEnddat=?,\r\n " +
				"tmCredat=?,\r\n " +
				"tmDesc=?,\r\n " +
				"tmCnt=?,\r\n " +
				"tmImg=?" +
				" where MEINUM=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,ti.getTmname());
			ps.setInt(2,ti.getTmprice());
			ps.setString(3,ti.getTmstartdat());
			ps.setString(4,ti.getTmenddat());
			ps.setString(5,ti.getTmcredate());
			ps.setString(6,ti.getTmdesc());
			ps.setInt(7,ti.getTmcnt());
			ps.setString(8,ti.getTmimg());
			return ps.executeUpdate();
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}

	public int deleteTicket(Ticket ti) throws SQLException {
		String sql = "delete from ticket_movie where tmNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setLong(1, ti.getTmnum());
			return ps.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			close();
		}
	}
}
