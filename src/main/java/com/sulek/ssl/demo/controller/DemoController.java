package com.sulek.ssl.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/GetDemo")
	public String vratDemoUdaje() {
		return "HELLO SLL IN SPRING BOOT MICROSERVICE";
	}
}
