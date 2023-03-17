package com.ssafy.backendPJT.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.backendPJT.dao.SongDAOImpl;
import com.ssafy.backendPJT.dto.Song;



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
				
			case "writeform":
				doFormWrite(req,resp);
				break;
				
			case "write":
				doWrite(req,resp);
				break;
				
			case "updateform":
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
		int id =  Integer.parseInt(req.getParameter("id"));
		try {
			dao.deleteSongs(id);
			
			resp.sendRedirect("main?act=list");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


	private void doUpdate(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String title = req.getParameter("title");
			String writer = req.getParameter("writer");
			String content = req.getParameter("content");
			String url = req.getParameter("url");
			String imgurl = req.getParameter("imgurl");
			int id  =Integer.parseInt( req.getParameter("id") );
			
			Song song = new Song();
			song.setTitle(title);
			song.setWriter(writer);
			song.setContent(content);
			song.setUrl(url);
			song.setImgurl(imgurl);
			song.setId(id);
			dao.updateSongs(song);
			
			resp.sendRedirect("main?act=list");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private void doFormUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		try {
			req.setAttribute("song", dao.updateForm(Integer.parseInt(req.getParameter("id"))));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("/board/updateform.jsp").forward(req, resp);
		
	}


	private void doWrite(HttpServletRequest req, HttpServletResponse resp) {
		
		try {
			String title = req.getParameter("title");
			String writer = req.getParameter("writer");
			String content = req.getParameter("content");
			String url = req.getParameter("url");
			String imgurl = req.getParameter("imgurl");
			
			
			Song song = new Song();
			song.setTitle(title);
			song.setWriter(writer);
			song.setContent(content);
			song.setUrl(url);
			song.setImgurl(imgurl);
			
			dao.insertSongs(song);
			
			resp.sendRedirect("main?act=list");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void doFormWrite(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/board/writeform.jsp").forward(req, resp);
	}


	private void doDetail(HttpServletRequest req, HttpServletResponse resp) {
		int id = Integer.parseInt(req.getParameter("id"));
		
		
		
		try {
			
			dao.updateViewCnt(id);
			
			
			req.setAttribute("song", dao.selectOne(id));
			req.getRequestDispatcher("/board/detail.jsp").forward(req, resp);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void doList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("list",dao.selectAll());
		req.getRequestDispatcher("/board/list.jsp").forward(req, resp);
		
	}
	
}
