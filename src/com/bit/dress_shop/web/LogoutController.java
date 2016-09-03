package com.bit.dress_shop.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

	public LogoutController() {
		System.out.println("LogoutController 생성자");
	}

	@RequestMapping("/logout")
	public String logout(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);

		if (session == null) {
			model.addAttribute("message", "이미 로그아웃상태입니다.");

			return "message";
		} else {
			session.invalidate();
			return "logout";
		}

	}
}
