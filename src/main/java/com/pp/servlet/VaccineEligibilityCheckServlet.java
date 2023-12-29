
package com.pp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VaccineEligibilityCheckServlet extends HttpServlet {
	@Override
          public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        	  		//get print writer
        	  PrintWriter pw=res.getWriter();
        	  //set response content type
        	  res.setContentType("text/html");
        	  //read form data(req param value)
        	  String name=req.getParameter("pname");
        	 String aged=req.getParameter("page");
        	 int age=Integer.parseInt(aged);
        	  String address= req.getParameter("paddrs");
        	  
        	  //write b.logic(request processing logic)
        	  if(age<18) 
        		  pw.println("<h1 style='color:red;text-align:center'> Mr./Miss "+name+", from "+address+"  you are not eligible for corona vaccination </h1>");
        	  else
        		  pw.println("<h1 style='color:red;text-align:center'> Mr./Mrs./Miss "+name+", from "+address+"  you are eligible for corona vaccination, Make it happen </h1>");
        	  
        	  //add graphical hyperlink
        	  pw.println("<a href ='crnaurl'> <img src='images/home.png'> </a>");
        	  //close stream
        	  pw.close();
          }//doGet
}//Class
