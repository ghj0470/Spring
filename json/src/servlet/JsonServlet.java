package servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import service.DepartService;
import service.MemberService;

class ErrMessage {
	private int errCode;
	private String errMsg;
	public int getErrCode() {
		return errCode;
	}
	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {

		this.errMsg = errMsg;

	}

}

/**
 * 
 * Servlet implementation class JsonServlet
 * 
 */

@WebServlet("/json/*")

public class JsonServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Gson gson = new Gson();
	private DepartService ds = new DepartService();
	private ErrMessage em = new ErrMessage();
	private MemberService ms = new MemberService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/") + 1);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		if (cmd.equals("list")) {
			String json = gson.toJson(ds.getDepartInfo());
			pw.print(json);
		}else if(cmd.equals("memberList")) {
			String json = gson.toJson(ms.getMemberInfo());
			pw.print(json);
		}
		
		else {
            response.setStatus(404);
			// response.sendError(404,"요청주소를 확인해주세요로시꾸");
			pw.print("주소 이상");
			pw.flush();
			return;
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}