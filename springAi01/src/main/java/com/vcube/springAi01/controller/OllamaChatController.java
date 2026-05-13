package com.vcube.springAi01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.springAi01.model.service.OllamaChatService;

@RestController
@RequestMapping("/chat")
public class OllamaChatController {
   
	@Autowired
	private OllamaChatService service;
	@GetMapping
	public String getInfo(@RequestParam String message)
	{
		return service.chat(message);
	}
}
