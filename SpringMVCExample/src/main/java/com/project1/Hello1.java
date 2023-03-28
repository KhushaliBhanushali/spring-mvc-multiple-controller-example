package com.project1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello1 {

	@RequestMapping("/v1")
	public String display() {
		return "viewpage1";
	}
}
