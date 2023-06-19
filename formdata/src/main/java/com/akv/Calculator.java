package com.akv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int A = Integer.parseInt(request.getParameter("A"));
		  int B = Integer.parseInt(request.getParameter("B"));
		  int C = A + B;

		  response.setContentType("text/html");
		  PrintWriter pw = response.getWriter();
		  pw.print("Sum =" + C);
		  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int A = Integer.parseInt(request.getParameter("A"));
		  int B = Integer.parseInt(request.getParameter("B"));
		  int C = A - B;

		  response.setContentType("text/html");
		  PrintWriter pw = response.getWriter();
		  pw.print("Sub =" + C);
	}

}
