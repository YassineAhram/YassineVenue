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

@Controller
public class UserController {
	
	protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value="/Welcome.htm")
    public ModelAndView form(HttpServletRequest request, HttpServletResponse response, User user)
            throws ServletException, IOException {
  
        String now = (new Date()).toString();
        logger.info("Returning Welcome view with " + now);
        
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);

        return new ModelAndView("Welcome", "now", now);

    }

}
