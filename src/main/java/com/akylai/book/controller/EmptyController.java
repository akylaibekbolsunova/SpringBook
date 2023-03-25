package com.akylai.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmptyController {

	@GetMapping("/")
	public String list() {
		return "index";
	}
}
