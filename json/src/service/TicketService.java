package service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import dao.TicketDAO;
import vo.Ticket;

public class TicketService {
	private TicketDAO tdao = new TicketDAO();
	
	public Map<String,Object>selectTicketList(Ticket ticket) {
		Map<String,Object> rMap =new HashMap<String,Object>();
		rMap.put("list", tdao.selectTicketList(ticket));
		rMap.put("page", 10);
		return rMap;
	}

	public Ticket selectTicket(Ticket ticket) {
		
		return tdao.selectTicket(ticket);
	}

	public int insertTicket(Ticket ticket) throws SQLException {
		return tdao.insertTicket(ticket);
	}

	public int updateTicket(Ticket ticket) throws SQLException {
		return tdao.updateTicket(ticket);
	}

	public int deleteTicket(Ticket ticket) throws SQLException {
		return tdao.deleteTicket(ticket);
	}
}
