package dao;

import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Order;

public class OrderDAO extends DBHelper {
	
	private static final OrderDAO INSTANCE = new OrderDAO();
	public static OrderDAO getInstance() {
		return INSTANCE;
	}
	private OrderDAO() {}
	
	public void insertOrder(Order order) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setString(1, order.getOrderId());
			psmt.setInt(2, order.getOrderProduct());
			psmt.setInt(3, order.getOrderCount());
			psmt.executeUpdate();
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Order selectOrder(int orderNo) {
		return null;
	}
	
	public List<Order> selectOrders() {
		return null;
	}
	
	public void updateOrder(Order order) {
		
	}
	
	public void deleteOrder(int orderNo) {
		
	}
}
