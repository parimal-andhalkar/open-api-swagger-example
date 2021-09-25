package com.openapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.reflectoring.api.UserApi;
import io.reflectoring.api.UserApiDelegate;



@RestController
//@RequestMapping("/pets")
@RequestMapping("${openapi.reflectoring.base-path:/v2}")
public class MyController implements UserApi {

	@Autowired
	private UserApiDelegate delegate;
		
	/*
	 * @GetMapping("/hello") public String hello() {
	 * 
	 * 
	 * return "Hello World"; }
	 */
	
	 @Override
	    public UserApiDelegate getDelegate() {
	        return delegate;
	    }

	
	
}
