package com.ssafy.backendPJT.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.backendPJT.dao.SongDAOImpl;



@WebServlet("/main")
public class SongController  extends HttpServlet {

	private static final long serialVersionUID = 1L;
	SongDAOImpl dao = SongDAOImpl.getInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		if(req.getMethod().equals("POST")) {
			req.setCharacterEncoding("UTF-8");
		}
		String act = req.getParameter("act");
		switch (act) {
		case "list":
			doList(req,resp);
			break;
			
		case "detail":
			doDetail(req,resp);
			break;
		case "formwrite":
			doFormWrite(req,resp);
			break;
		case "write":
			doWrite(req,resp);
			break;
			
		case "formupdate":
			doFormUpdate(req,resp);
			break;
		case "update":
			doUpdate(req,resp);
			break;
			
		case "delete":
			doDEL(req,resp);
			break;

		default:
			break;
		}
		
	}


	private void doDEL(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}


	private void doUpdate(HttpServletRequest req, HttpServletResponse resp) {

		
	}


	private void doFormUpdate(HttpServletRequest req, HttpServletResponse resp) {
	
		
	}


	private void doWrite(HttpServletRequest req, HttpServletResponse resp) {
	
		
	}


	private void doFormWrite(HttpServletRequest req, HttpServletResponse resp) {
		
		
	}


	private void doDetail(HttpServletRequest req, HttpServletResponse resp) {
	
		
	}


	private void doList(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("list",dao.selectAll());
		
	}
	
}
