package user1;

public class SQL {

	// SQL
	public static final String INSERT_USER1 = "INSERT INTO `User1` VALUES (?,?,?,?)";
	public static final String SELECT_USER1_LIST = "SELECT * FROM `User1`";
	public static final String SELECT_USER1 = "SELECT * FROM `User1` WHERE `uid`=?";
	public static final String UPDATE_USER1 = "UPDATE `User1` SET `name`=?, `hp`=?, `age`=? WHERE `uid`=?";
	public static final String DELETE_USER1 = "DELETE FROM `User1` WHERE `uid`=?";
}
