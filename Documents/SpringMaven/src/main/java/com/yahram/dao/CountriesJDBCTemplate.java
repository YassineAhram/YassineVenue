package com.yahram.dao;

import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.yahram.controller.Countries;

public class CountriesJDBCTemplate extends JdbcDaoSupport implements CountriesDao {
	
	private JdbcTemplate jdbcTemplateObject; 
	
	@SuppressWarnings("unchecked")
	public List<Countries> getList(){
		String sql = "select * from countries";
		List<Countries> countryList = (List<Countries>)jdbcTemplateObject.query(sql, new CountriesMapper());
		return countryList;
	}

}
