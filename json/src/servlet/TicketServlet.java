package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import service.TicketService;
import vo.Ticket;

/**
 * Servlet implementation class TicketServlet
 */
@WebServlet("/api/ticket/*")
public class TicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson = new Gson();
	private TicketService ts = new TicketService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String params = request.getParameter("params");
		response.setCharacterEncoding("utf-8");
		Ticket t = new Ticket(); 
		if (t != null && !t.equals("")) {
			t = gson.fromJson(params, Ticket.class);
		}
		String uri = request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/") + 1);
		if (cmd.equals("list")) {
			doWrite(response, ts.selectTicketList(t));
		} else if (cmd.equals("view")) {
			System.out.println(t);
			doWrite(response, ts.selectTicket(t));
		} else {

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Ticket t = gson.fromJson(request.getReader(), Ticket.class);
		System.out.println(t);
		int rCnt=0;
		try {
			rCnt = ts.insertTicket(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, Integer> rMap = new HashMap<String, Integer>();
		rMap.put("rCnt", rCnt);
		doWrite(response, rMap);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Ticket t = gson.fromJson(request.getReader(), Ticket.class);
		int rCnt = 0;
		try {
			rCnt = ts.updateTicket(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, Integer> rMap = new HashMap<String, Integer>();
		rMap.put("rCnt", rCnt);
		doWrite(response, rMap);
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Ticket t = gson.fromJson(request.getReader(), Ticket.class);
		int rCnt=0;
		try {
			rCnt = ts.deleteTicket(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String,Integer> rMap = new HashMap<String,Integer>();
		rMap.put("rCnt", rCnt);
		doWrite(response,rMap);
	}

	private void doWrite(HttpServletResponse res, Object obj) throws IOException {
		res.setContentType("application/jon;charset=utf-8");
		PrintWriter pw = res.getWriter();
		System.out.println(obj);
		pw.write(gson.toJson(obj));
		pw.flush(); 
	}

}
