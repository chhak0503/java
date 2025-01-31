package dao;

import java.util.ArrayList;
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
		
		List<Order> orders = new ArrayList<Order>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_ORDERS);
			
			while(rs.next()) {
				Order order = new Order();
				order.setOrderNo(rs.getInt(1));
				order.setOrderId(rs.getString(2));
				order.setProdName(rs.getString(3));
				order.setOrderCount(rs.getInt(4));
				order.setPrice(rs.getInt(5));
				order.setTotal(rs.getInt(6));
				order.setOrderDate(rs.getString(7));
				orders.add(order);
			}
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	
	public void updateOrder(Order order) {
		
	}
	
	public void deleteOrder(int orderNo) {
		
	}
}
