package com.bit.dress_shop.web;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bit.dress_shop.domain.Member;
import com.bit.dress_shop.service.MemberService;

@Controller
public class LoginController {
	@Autowired
	private MemberService service;

	public LoginController() {
		System.out.println("LoginController 생성자");
	}

	@RequestMapping(value = "/login_result", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		HashMap login = new HashMap<String, String>();
		login.put("id", id);
		login.put("password", password);
		
		
		Member member = null;

		if ((member = service.loginMember(login)) != null) {
			HttpSession session = request.getSession(false);
			if (session != null) {
				session.invalidate();
			}
			session = request.getSession(true);

			synchronized (session) {
				session.setAttribute("result", member);
			}
			
			return "login";
		} else {
			System.out.println("error");
			model.addAttribute("result", id);
			
			return "loginerror";
		}
	}

}
