package shop.dao;

import java.util.ArrayList;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.OrderVO;

public class OrderDAO extends DBHelper {

	// 싱글톤
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	// 기본 CRUD 메서드
	public int insertOrder(OrderVO vo) {
		int count = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setString(1, vo.getOrderId());
			psmt.setInt(2, vo.getOrderProduct());
			psmt.setInt(3, vo.getOrderCount());
			count = psmt.executeUpdate();
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public OrderVO selectOrder(int orderNo) {
		return null;
	}
	
	public List<OrderVO> selectOrders() {
		
		List<OrderVO> orders = new ArrayList<>();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				OrderVO vo = new OrderVO();
				vo.setOrderNo(rs.getInt(1));
				vo.setOrderId(rs.getString(2));
				vo.setOrderProduct(rs.getInt(3));
				vo.setOrderCount(rs.getInt(4));
				vo.setOrderDate(rs.getString(5));
				orders.add(vo);
			}
			closeAll();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	
	public List<OrderVO> selectOrders(String orderId) {
		
		List<OrderVO> orders = new ArrayList<>();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS_BY_ORDERID);
			psmt.setString(1, orderId);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				OrderVO vo = new OrderVO();
				vo.setOrderNo(rs.getInt(1));				
				vo.setOrderProduct(rs.getInt(2)); 
				vo.setProdName(rs.getString(3)); 
				vo.setOrderCount(rs.getInt(4));
				vo.setOrderer(rs.getString(5));
				vo.setOrderDate(rs.getString(6).substring(2, 10));
				orders.add(vo);
			}
			closeAll();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	
	public int updateOrder(OrderVO vo) {
		return 0;
	}
	
	
	public int deleteOrder(int orderNo) {
		return 0;
	}
}