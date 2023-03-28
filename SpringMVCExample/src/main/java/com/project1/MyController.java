package com.project1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String display() {
		return "index";
	}
	
	@RequestMapping("/v1")
	public String view() {
		return "viewpage1";
	}
	
	@RequestMapping("/v2")
	public String show() {
		return "viewpage2";
	}
}
