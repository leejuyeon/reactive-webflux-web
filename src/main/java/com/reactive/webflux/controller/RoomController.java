package com.reactive.webflux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RoomController {

	@GetMapping("/room/{path1}")
	public String room(final Model model, @PathVariable String path1) {
		return new StringBuilder("room/").append(path1).toString();
	}
	
}
