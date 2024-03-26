package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/product/*")
@Log4j
public class ProductController {
	@GetMapping("/shop")
	public void shopForm() {
		log.info("go shop");
}
	@GetMapping("/product_details")
	public void prodetailForm() {
		log.info("go shop");
}
}