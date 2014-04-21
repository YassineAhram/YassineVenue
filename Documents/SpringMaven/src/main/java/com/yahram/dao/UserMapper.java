package com.yahram.dao;

import java.sql.SQLException;
import java.sql.ResultSet;

import org.springframework.jdbc.core.RowMapper;
import com.yahram.controller.*;


@SuppressWarnings("rawtypes")
public class UserMapper implements RowMapper{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException{
		User user = new User();
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setMobile(rs.getString("mobile"));
		user.setPc(rs.getString("pc"));
		return user;
	}
	
	

}
