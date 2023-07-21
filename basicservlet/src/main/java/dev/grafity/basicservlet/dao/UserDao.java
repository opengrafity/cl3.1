package dev.grafity.basicservlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dev.grafity.basicservlet.models.User;

public class UserDao {
	private static final String ORACLE_CONNECTIO_STR="jdbc:oracle:thin:@localhost:1521:xe";
	public User getUser(int userId) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(ORACLE_CONNECTIO_STR, "SYSTEM", "Grafity123$");
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM GRAFITY_USERS WHERE USERID=?");
		stmt.setInt(1, userId);
		ResultSet rs = stmt.executeQuery();
		User user = new User();
		while(rs.next()) {
			user.setUsername(rs.getString("USERNAME"));
			user.setPassword(rs.getString("PASSWORD"));
			user.setGender(rs.getString("GENDER"));
			user.setMobileNumber(rs.getString("MOBILENUMEBR"));
			user.setAddress(rs.getString("ADDRESS"));
			user.setCity(rs.getString("CITY"));
			user.setPincode(rs.getString("PINCODE"));								
		}			
		return user;
	}
	
	public boolean saveUser(User user) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(ORACLE_CONNECTIO_STR, "SYSTEM", "Grafity123$");
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO GRAFITY_USERS(USERID,USERNAME,PASSWORD,GENDER,MOBILENUMEBR,ADDRESS,CITY,PINCODE,REGISTERED_BY) "
														+ "VALUES (?,?,?,?,?,?,?,?,?)");
		
		stmt.setInt(1, user.getUserId());
		stmt.setString(2, user.getUsername());
		stmt.setString(3, user.getPassword());
		stmt.setString(4, user.getGender());
		stmt.setString(5, user.getMobileNumber());
		stmt.setString(6, user.getAddress());
		stmt.setString(7, user.getCity());
		stmt.setString(8, user.getPincode());
		stmt.setString(9, user.getRegisteredBy());
		
		int rowsAffected = stmt.executeUpdate();
		
		return rowsAffected>0?true:false;
		
	}
}
