package com.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController 
{
	@RequestMapping("/test")
	@ResponseBody
	public String testHandler()
	{
		return "Hey this is the first spring boot project by the STS in Eclipse itself";
	}
	
	@RequestMapping("/test2")
	@ResponseBody
	public String test()
	{
		return "I am only for demo";
	}
	
	@RequestMapping("/home")
	public String homesHandler()
	{
		return "homes";
	}
}
