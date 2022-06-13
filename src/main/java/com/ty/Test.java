package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	@RequestMapping("/hi")
	public String hi() {System.out.println("hi called");
		return "index.jsp";
	}
}
