package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	@GetMapping({"/blog","/blog_details"})
	public void boardForm() {
		log.info("BOARD MOVE........");
	}
	@GetMapping("/elements")
	public void elementsForm() {
		log.info("css 변경하는곳..");
	}
}
