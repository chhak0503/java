package service;

import java.util.List;

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
	
	public List<Product> listProduct() {
		return dao.selectProducts();
	}

}
