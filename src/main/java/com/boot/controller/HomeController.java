package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("/")

public String home(){
	return "van boot,reporting fo duty!";
}
}
