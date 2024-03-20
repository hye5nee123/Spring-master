package com.yedam.app;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NowServ
 */
@WebServlet("/NowServ")
public class NowServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NowServ() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    Date today = new Date();
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 포맷 지정
	    String formattedDate = format.format(today); // 현재 날짜를 포맷팅하여 문자열로 저장
	    request.setAttribute("today", formattedDate); // 포맷팅된 날짜를 request에 저장
	    request.getRequestDispatcher("now.jsp").forward(request, response); // JSP로 포워딩
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
