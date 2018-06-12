package com.java.webSpringApplication.controller;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@ComponentScan(basePackages="com.java.webSpringApplication")
@Controller
public class SampleController {
    private static final Logger logger = Logger.getLogger(SampleController.class);

	
	@RequestMapping(value="/name",method = RequestMethod.GET)
	public String showMyName(@RequestParam(value="id") String id)
	{
		logger.info("This is sample controller class");
		logger.info("Id is: "+id);
		return "balu";
	}

}