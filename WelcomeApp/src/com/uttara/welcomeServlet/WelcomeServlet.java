package com.uttara.welcomeServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        System.out.println("no arg contr");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doget() of the method");
		
	     String name	=request.getParameter("uname");
	     String a=request.getParameter("age");
		/*
		 * do the input validation
		 * buissness validation
		 */
		PrintWriter pw=response.getWriter();
		if(name==null||name.trim().equals(""))
		{
			pw.write("<html><body>enter the proper the name</body></html>");
		}
		else
			
		{
			try
			{
				int age=Integer.parseInt(a);
				if(age>150||age<0)
					pw.write("<html><body>enter the proper age</body></html>");
				else
				{
				if(age<50)
					pw.write("<html><body>wwelcome youngseter</body></html>");
				else
					pw.write("<html><body>enter oldi goldie</body></html>");
				}
					
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
				pw.write("<html><body>get lost</body></html>");
			}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
