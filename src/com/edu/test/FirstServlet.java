package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet{
	

		@Override
		public void init(ServletConfig config) throws ServletException {
			// TODO Auto-generated method stub
			System.out.println("First Servlet init");
			//super.init(config);
		}
		
		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println("First Servlet service");
			//super.service(req, res);
		}

}
