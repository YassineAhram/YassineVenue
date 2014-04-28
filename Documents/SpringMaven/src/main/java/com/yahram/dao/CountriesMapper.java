package com.yahram.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yahram.controller.Countries;

@SuppressWarnings("rawtypes")
public class CountriesMapper implements RowMapper {
	
	public Object mapRow(ResultSet rs, int rowNum)throws SQLException{
		Countries countries = new Countries();
		
		countries.setCountryCode(rs.getString("countryCode"));
		countries.setCountryName(rs.getString("countryName"));
		return countries;
		
	}

}
