package com.yahram.dao;







import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

//import com.yahram.controller.User;

public class UserJDBCTemplate extends JdbcDaoSupport implements UserDao  {
	
	  //private DataSource dataSource;
	  private JdbcTemplate jdbcTemplateObject;  
	  
	  //public void setDataSource(DataSource dataSource) {
	   //this.dataSource = dataSource;
	   //this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	  //}
	  
	//Method to consult if  the email and password belong to an account registred
	    
		@SuppressWarnings("unchecked")
		public boolean isAcountExists(String email, String password) {
	        String sql = "SELECT * FROM user WHERE email='"+email+"' AND password='"+password+"'";
	        boolean a = (boolean)jdbcTemplateObject.queryForObject(sql, new Object[] {"email", "password"}, new UserMapper());
	        		//jdbcTemplateObject.queryForObject(sql, new UserMapper());
	        
	        
	        return a;
	    }
		
		public String getNameByEmail(String email) {
			String sql = "SELECT * FROM user WHERE email='"+email+"'";
			String name = jdbcTemplateObject.queryForObject(sql, new Object [] {"email"}, String.class);
			return name;
			
		}
	    
	    //Method to consult if is the email received  is registred
	    @SuppressWarnings("unchecked")
		public boolean isEmailRegistered(String email){
	        String sql = "SELECT * FROM usuarios WHERE email='"+email+"'";
	        boolean b = (boolean)jdbcTemplateObject.queryForObject(sql, new Object[] {"email"}, new UserMapper());
	 
	        return b;
	    }
	    
	    //Method to register an account
	    public void registerUser(String firstName, String lastName, String email, String password, String mobile, String address, String pc) {
	        String sql = "INSERT INTO `usuarios`(`firstName`,`lastName`,`email`,`password`,`mobile`,`address`,`pc`) VALUES ('"+firstName+"','"+lastName+"','"+email+"','"+password+"','"+mobile+"','"+address+"','"+pc+"')";

	       jdbcTemplateObject.update(sql, firstName, lastName, email, password, mobile, address, pc);
	       System.out.println("Register created firstName = " + firstName + " lastName = " + lastName+ " email = " + email+ " password = " + password+ " mobile = " + mobile+ " address = " + address+ " pc = " + pc);
	       return;
	        

	        
	    }
	    

}
