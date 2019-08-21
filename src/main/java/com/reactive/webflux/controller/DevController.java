package com.reactive.webflux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.server.ServerWebExchange;

@Controller
public class DevController {

	@GetMapping("/")
	public String index(final Model model) {
		return "index";
	}


	@GetMapping(value = {"/service"})
	public String service(final ServerWebExchange exchange) {
		return "service";
	}
}
