package com.yahram.dao;

import javax.sql.DataSource;
//import com.yahram.controller.User;

public interface UserDao {
	
	// start the conexion db
	    public void setDataSource(DataSource ds);
	    public String getNameByEmail(String email);
	    public boolean isAcountExists(String email, String password);
	    public boolean isEmailRegistered(String email);
	    public void registerUser(String firstName, String lastName, String email, String password, String mobile, String address, String pc);

}
