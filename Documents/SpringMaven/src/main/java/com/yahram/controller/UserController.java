package com.yahram.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yahram.dao.UserDao;
import com.yahram.dao.UserJDBCTemplate;

@Controller
public class UserController {
	
	//protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value="/Welcome.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userEmail = request.getParameter("email");
        UserJDBCTemplate d = new UserJDBCTemplate();
        
        if(d.isEmailRegistered(userEmail)){
        	String date = (new Date()).toString();
        	String now = "Welcome "+userEmail+ "now is"+date;
        	return new ModelAndView("Welcome", "now", now);
        	
        }
        
        else{
        	return new ModelAndView("Register", "now", "Sorry, Email no exist");
        }
       
       
        

        

    }

}
