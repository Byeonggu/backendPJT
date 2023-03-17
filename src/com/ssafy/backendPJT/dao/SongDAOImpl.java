package com.ssafy.backendPJT.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.backendPJT.dto.Song;
import com.ssafy.backendPJT.util.DBUtil;

public class SongDAOImpl implements SongDAO {

	private final DBUtil util = DBUtil.getInstance();

	private static SongDAOImpl instance = new SongDAOImpl();

	private SongDAOImpl() {

	}

	public static SongDAOImpl getInstance() {
		return instance;
	}

	@Override
	public List<Song> selectAll() {
		List<Song> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = util.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM SONGS ORDER BY viewcnt DESC";

			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Song song = new Song();
				song.setId(rs.getInt("id"));
				song.setTitle(rs.getString("title"));
				song.setWriter(rs.getString("writer"));
				song.setContent(rs.getString("content"));
				song.setViewCnt(rs.getInt("viewcnt"));
				song.setRegDate(rs.getString("regdate"));
				song.setUrl(rs.getString("url"));
				song.setImgurl(rs.getString("imgurl"));
				list.add(song);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(rs, stmt, conn);
		}
		return list;
	}

	@Override
	public Song selectOne(int id) throws SQLException {
		String sql = "SELECT * FROM SONGS WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Song song = new Song();
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				song.setId(rs.getInt(1));
				song.setTitle(rs.getString(2));
				song.setWriter(rs.getString(3));
				song.setContent(rs.getString(4));
				song.setViewCnt(rs.getInt(5));
				song.setRegDate(rs.getString(6));
				song.setUrl(rs.getString(7));
				song.setImgurl(rs.getString(8));
			}
		} finally {
			util.close(rs, pstmt, conn);
		}

		return song;
	}

	@Override
	public void insertSongs(Song song) throws SQLException {
		String sql = "INSERT INTO SONGS VALUES (0,?,?,?,?,NOW(),?,?)" ;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, song.getTitle());
			pstmt.setString(2, song.getWriter());
			pstmt.setString(3, song.getContent());
			pstmt.setInt(4,song.getViewCnt());
			pstmt.setString(5,song.getUrl());
			pstmt.setString(6, song.getImgurl());
			pstmt.executeUpdate();		
		}finally {
			util.close(pstmt,conn);
		}
	}

	@Override
	public void deleteSongs(int id) throws SQLException {
		String sql = "DELETE FROM SONGS WHERE id =?";
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 데이터가 지워졌습니다.");
		}finally {
			util.close(pstmt,conn);
		}
	}

	@Override
	public void updateSongs(Song song) throws SQLException {
		String sql = "UPDATE SONGS SET title =?, content =?, regdate=NOW(), url =?, imgurl=? WHERE id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, song.getTitle());
			pstmt.setString(2, song.getContent());
			pstmt.setString(3, song.getUrl());
			pstmt.setString(4, song.getImgurl());
			pstmt.setInt(5, song.getId());
			pstmt.executeUpdate();
		}finally {
			util.close(pstmt,conn);
		}

	}

	@Override
	public void updateViewCnt(int id) throws SQLException {
		String sql = "UPDATE SONGS SET viewcnt = viewcnt+1 WHERE id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		}finally {
			util.close(pstmt,conn);
		}

	}

	@Override
	public Song updateForm(int id) throws SQLException {
		String sql = "SELECT * FROM SONGS WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Song song = new Song();
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			rs= pstmt.executeQuery();
			while (rs.next()) {
				song.setId(rs.getInt(1));
				song.setTitle(rs.getString(2));
				song.setWriter(rs.getString(3));
				song.setContent(rs.getString(4));
				song.setViewCnt(rs.getInt(5));
				song.setRegDate(rs.getString(6));
				song.setUrl(rs.getString(7));
				song.setImgurl(rs.getString(8));
			}
		} finally {
			util.close(rs, pstmt, conn);
		}

		return song;
		
	}

}
