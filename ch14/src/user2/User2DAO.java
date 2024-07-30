package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import user1.User1DAO;
import user1.User1VO;

public class User2DAO {
	
	// 싱글톤
	private static User2DAO instance = new User2DAO();
	public static User2DAO getInstance() {
		return instance;
	}
	private User2DAO() {}
	
	// DB 정보 및 자원 리소스
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	private void closeAll() throws SQLException {
		if(rs != null) {
			rs.close();	
		}
		
		if(stmt != null) {
			stmt.close();
		}
		
		if(psmt != null) {
			psmt.close();
		}
		
		if(conn != null) {
			conn.close();
		}
	}
	
	
	// CRUD 메서드
	public void insertUser(User2VO vo) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER2);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getAddr());
			psmt.executeUpdate();
			closeAll();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public User2VO selectUser(String uid) {
		
		User2VO user = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER2);
			psmt.setString(1, uid);
			rs = psmt.executeQuery();
			
			// 조회결과가 1 또는 0이기 때문에 while 대신 if문으로 next()
			if(rs.next()) {
				user = new User2VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
			}
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	public List<User2VO> selectUsers() {
		
		List<User2VO> users = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_USER2S);
			
			while(rs.next()) {
				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setAddr(rs.getString(4));
				users.add(vo);
			}
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public int updateUser(User2VO vo) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER2);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getBirth());
			psmt.setString(3, vo.getAddr());
			psmt.setString(4, vo.getUid());
			
			// sql이 적용되는 row 카운터 반환
			result = psmt.executeUpdate();
			
			closeAll();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		return result;
	}
	
	public int deleteUser(String uid) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER2);
			psmt.setString(1, uid);
			
			result = psmt.executeUpdate();
			closeAll();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

}
