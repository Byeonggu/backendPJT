package com.ssafy.backendPJT.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/main")
public class SongController  extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		if(req.getMethod().equals("POST")) {
			req.setCharacterEncoding("UTF-8");
		}
		String act = req.getParameter("act");
		switch (act) {
		case "list":
			
			break;
			
		case "detail":
			
			break;
		case "formwrite":
			
			break;
		case "write":
			
			break;
			
		case "formupdate":
			
			break;
		case "update":
			
			break;
			
		case "delete":
			
			break;

		default:
			break;
		}
		
	}
	
}
