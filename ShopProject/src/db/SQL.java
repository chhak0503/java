package db;

public class SQL {

	// customer
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES (?,?,?,?,NOW())";
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";
	
	// order
	
	// product
	// alter table `product` modify `prodNo` int auto_increment;
	public static final String INSERT_PRODUCT = "INSERT INTO `Product` SET "
												+ "`prodName`=?,"
												+ "`stock`=?,"
												+ "`price`=?,"
												+ "`company`=?";
	
}
