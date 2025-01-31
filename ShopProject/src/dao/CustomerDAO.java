package dao;

import java.sql.ResultSet;
import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Customer;

public class CustomerDAO extends DBHelper {
	
	// 싱글톤
	private static final CustomerDAO INSTANCE = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return INSTANCE;
	}
	private CustomerDAO() {}
		
	// 기본 CRUD
	public void insertCustomer(Customer customer) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, customer.getCustId());
			psmt.setString(2, customer.getName());
			psmt.setString(3, customer.getHp());
			psmt.setString(4, customer.getAddr());
			psmt.executeUpdate();
			closeAll();		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Customer selectCustomer(String custId) {
		
		Customer customer = null; // 선언
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				customer = new Customer(); // 생성
				customer.setCustId(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setHp(rs.getString(3));
				customer.setAddr(rs.getString(4));
				customer.setRdate(rs.getString(5));
			}
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return customer; // 리턴
	}
	
	public List<Customer> selectCustomers() {
		return null;
	}
	
	public void updateCustomer(Customer customer) {
		
	}
	
	public void deleteCustomer(String custId) {
		
	}
}







