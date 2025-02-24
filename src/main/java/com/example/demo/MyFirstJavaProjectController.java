package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstJavaProjectController {
	@RequestMapping("/{num}")
	public String index(@PathVariable int num, Model model) {
		int sum = 0;
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		model.addAttribute("msg", "sum=" + sum);
		return "index";
	}
}
