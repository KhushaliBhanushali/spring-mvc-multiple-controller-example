package com.project1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello2 {

	@RequestMapping("/v2")
	public String display() {
		return "viewpage2";
	}
}
