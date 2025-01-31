package dao;

import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Product;

public class ProductDAO extends DBHelper {
	
	private static final ProductDAO INSTANCE = new ProductDAO();
	public static ProductDAO getInstance() {
		return INSTANCE;
	}
	private ProductDAO() {}
	
	public void insertProduct(Product product) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_PRODUCT);
			psmt.setString(1, product.getProdName());
			psmt.setInt(2, product.getStock());
			psmt.setInt(3, product.getPrice());
			psmt.setString(4, product.getCompany());
			psmt.executeUpdate();
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Product selectProduct(int prodNo) {
		return null;
	}

	public List<Product> selectProducts() {
		return null;
	}
	
	public void updateProduct(Product product) {
		
		try {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteProduct(int prodNo) {
		
	}
}
