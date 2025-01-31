package dao;

import java.util.ArrayList;
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
		
		List<Product> products = new ArrayList<Product>();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				Product product = new Product();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
				products.add(product);
			}
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return products;
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
