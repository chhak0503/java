package shop.db;

public class SQL {

	// customer
	public static final String INSERT_CUSTOMER  = "insert into `customer` set "
												+ "`custId`=?,"
												+ "`name`=?,"
												+ "`hp`=?,"
												+ "`addr`=?,"
												+ "`rdate`=NOW()";
	
	public static final String SELECT_CUSTOMER  = "select * from `customer` where `custId`=?";
	public static final String SELECT_CUSTOMERS = "select * from `customer`";
	public static final String UPDATE_CUSTOMER  = "update `customer` set "
												+ "`name`=?,"
												+ "`hp`=?,"
												+ "`addr`=? "
												+ "where `custId`=?";
	
	public static final String DELETE_CUSTOMER  = "delete from `customer` where `custId`=?";
	
	// order
	
	// product
	
}
