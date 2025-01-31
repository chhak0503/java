package db;

public class SQL {
	
	// customer
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES (?,?,?,?,NOW())";
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";
	
	// order
	public static final String INSERT_ORDER = "INSERT INTO `Order` SET "
												+ "`orderId`=?,"
												+ "`orderProduct`=?,"
												+ "`orderCount`=?,"
												+ "`orderDate`=NOW()";
	
	public static final String SELECT_ORDERS = "SELECT "
												+ "`orderNo`,"
												+ "`orderId`,"
												+ "`prodName`,"
												+ "`orderCount`,"
												+ "`price`,"
												+ "`orderCount` * `price` as `total`,"
												+ "`orderDate` "
												+ "FROM `Order` as a "
												+ "JOIN `Product` as b ON a.orderProduct = b.prodNo";

	// product
	// alter table `product` modify `prodNo` int auto_increment;
	public static final String INSERT_PRODUCT = "INSERT INTO `Product` SET "
												+ "`prodName`=?,"
												+ "`stock`=?,"
												+ "`price`=?,"
												+ "`company`=?";
	
	public static final String SELECT_PRODUCTS = "SELECT * FROM `Product`";
	
}
