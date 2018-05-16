package multi.edu.board;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Component
public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public void getConn() {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<BoardVO> getBoardList() { // 모든 포스트를 가져온다.
		String sql = "SELECT * FROM BOARD";
		try {
			getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ArrayList<BoardVO> boardList = new ArrayList<>();
			while (rs.next()) {
				boardList.add(new BoardVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			return boardList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public BoardVO getBoard(int idx) { // 모든 포스트를 가져온다.
		String sql = "SELECT * FROM BOARD WHERE IDX=?";
		try {
			getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			BoardVO board = null;
			if (rs.next()) {
				board = new BoardVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
			return board;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public void insertBoard(BoardVO vo){
		String sql = "INSERT"
				+ " INTO BOARD (IDX, TITLE, CONTENT, NAME, FILE_NAME) "
				+ " VALUES(BOARD_SEQ.NEXTVAL, ?,?,?,?)";
		try {
			getConn();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getTitle()); //title
			pstmt.setString(2, vo.getContent()); //content
			pstmt.setString(3, vo.getName()); //author = id
			pstmt.setString(4, vo.getFile_name());
			
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void deleteBoard(int idx){
		String sql = "DELETE FROM BOARD WHERE IDX=?";
		try {
			getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void updateBoard(BoardVO vo){
		String sql = "UPDATE BOARD"
				+ " SET TITLE=?, CONTENT=?, NAME=?, FILE_NAME=?"
				+ " WHERE IDX=?";
		try {
			getConn();
			System.out.println("dao : "+vo);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle()); //title
			pstmt.setString(2, vo.getContent()); //content
			pstmt.setString(3, vo.getName()); //author = id
			pstmt.setString(4, vo.getFile_name()); 
			pstmt.setString(5, vo.getIdx()); //
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
