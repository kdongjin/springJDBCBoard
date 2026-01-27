package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

	
	@GetMapping("/insertForm")
	public String getMethodName(Model model) {
		return "board/insertForm";
	}
	
}
