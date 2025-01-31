package service;

import dao.ProductDAO;
import entity.Product;

public class ProductService {
	
	private static final ProductService INSTANCE = new ProductService();
	public static ProductService getInstance() {
		return INSTANCE;
	}
	private ProductService() {}
	
	private ProductDAO dao = ProductDAO.getInstance();
	
	public void registerProduct(Product product) {
		dao.insertProduct(product);
	}

}
