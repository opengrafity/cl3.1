package com.amfibyn.springjdbcdemo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.amfibyn.springjdbcdemo.model.Account;
@Repository
public class AccountsDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void storeAccounts(Account acc) {
		String insertAccount = "INSERT INTO ACCOUNTS (ACCOUNT_ID,ACCOUNT_NAME,BALANCE) "
				+ " VALUES(?,?,?)";
		
		int noOfRows = jdbcTemplate.update(insertAccount,acc.getAccountId(), acc.getAccountName(), acc.getBalance());
		
		System.out.println(noOfRows);
		
	}
	
	public List<Account> getAccounts(){
		String getEmps = "SELECT * FROM ACCOUNTS";
		return jdbcTemplate.query(getEmps,new AccountRowMapper());
	}
	
	class AccountRowMapper implements RowMapper<Account>{

		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			 Account acc = new Account();
			 acc.setAccountId(rs.getInt("ACCOUNT_ID"));
			 acc.setAccountName(rs.getString("ACCOUNT_NAME"));
			 acc.setBalance(rs.getDouble("BALANCE"));
			return acc;
		}
		
	}
}
