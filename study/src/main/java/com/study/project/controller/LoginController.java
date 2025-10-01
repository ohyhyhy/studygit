package com.study.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.project.service.LoginServiceInter;

@Controller //Controller는 class 위에만 붙인다. interface 에는 붙이지 않음.

public class LoginController {

	 @Autowired
	 public LoginServiceInter service;
	 
	 // mapper.xml --- select 
	 
	 @RequestMapping("login") // 404 에러: 화면을 못 찾을 때
	 @ResponseBody	// ☆object 형태☆로 감싸기 위함 
	 public List<Map<String, Object>> login() {
		 // String, 어느 데이터형이나 가능한 Object 
		 
		 //db user 들의 데이터를 담아서 
		 //List 저장 후 리턴 
		 //빈 그릇
		 List<Map<String, Object>> loginList = service.login();
		 // 자바의 기본적인 메소드 리턴: List 형식으로 리턴
				 
		return loginList;
		 
	 }
	 

}
