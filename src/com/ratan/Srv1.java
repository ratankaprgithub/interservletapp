package com.ratan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Srv1
 */
@WebServlet("/Srv1")
public class Srv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Srv1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		 HttpSession ses=request.getSession();
		
		
		  String snum1 = request.getParameter("num1"); String snum2 =
		  request.getParameter("num2");
		  
		  int n1=Integer.parseInt(snum1.trim()); int n2=Integer.parseInt(snum2.trim());
		  
		  int result = n1+n2;
		  
		  
		 ses.setAttribute("resultData", result);
		  
		  
		  response.sendRedirect("Srv2");
		  
		 

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
