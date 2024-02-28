package com.springboot.web2seokjun20240220.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

	@GetMapping("/index")	//요청받으면 인덱스 메서드를 실행해!
	public String index() {
		return "hello";	
	}
	
	
	@ResponseBody
	@GetMapping("ap1/v1/username")
	public String getUsername() {
		return "kimseokjun";	//ResponseBody 떄문에 문자열이 그대로 나옴
	}
}


