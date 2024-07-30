package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class UserDAO {

	// 싱글톤
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}
	
	
	// DB 정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	// CRUD 메서드
	public void insertUser(User1VO vo) {
		
		String sql = "INSERT INTO `user1` values (?,?,?,?,?)";
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getHp());
			psmt.setInt(5, vo.getAge());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public User1VO selectUser(String uid) {
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<User1VO> selectUsers() {
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void updateUser(User1VO vo) {
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteUser(String uid) {
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}











