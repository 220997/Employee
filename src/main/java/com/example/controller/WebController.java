package com.example.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.SampleResponse;

@RestController
public class WebController {
	public SampleResponse Sample(@RequestParam(value="name", defaultValue="Robot")String name){
		SampleResponse response=new SampleResponse();
		response.setId(1);
		response.setMessage("your name is"+name);
		return response;
		
	}
	

}
