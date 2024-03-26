package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/void/*")
@Log4j
public class VoidController {
	@GetMapping("/about")
	public void aboutForm() {
		log.info("about");
}
	@GetMapping("/contact")
	public void contactForm() {
		log.info("contact");
}
}