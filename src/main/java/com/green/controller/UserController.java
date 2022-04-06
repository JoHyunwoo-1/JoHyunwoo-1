package com.green.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/*")
public class UserController {
	// 로그인 페이지
	@RequestMapping("loginPage")
	public String userLoginPage() {
		return "/user/UserLogin";
	}

	@RequestMapping("signupPage")
	public String userSignupPage() {
		return "/user/signupPage";
	}

	@RequestMapping("/findPage")
	public String findPage() {
		return "/user/findPage";
	}
}
