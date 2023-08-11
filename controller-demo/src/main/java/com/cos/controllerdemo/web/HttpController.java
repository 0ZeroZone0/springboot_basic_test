package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller 			//파일을 응답하는 컨트롤 (클라이언트가 브라우저면 .html 파일을 응답하는게 좋다)
@RestController 	//데이터를 응답하는 컨트롤러 (클라이언트가 핸드폰이면 data를 응답하는게 좋)
public class HttpController {

	//http://localhost:8080/get
	@GetMapping("/get")
	public String get()	{
		//만약 @Controller 파일 어노테이션이였을때는 return 하는게 파일명이 되어야한다.  return "a.html";
		return "<h1>get 요청됨</h1>";
	}
	
	//http://localhost:8080/post
	@PostMapping("/post")
	public String post()	{
		return "post 요청됨";
	}
	
	//http://localhost:8080/put
	@PutMapping("/put")
	public String put()	{
		return "put 요청됨";
	}
	
	//http://localhost:8080/delete
	@DeleteMapping("/delete")
	public String delete()	{
		return "delete 요청됨";
	}
	
	
	
}
