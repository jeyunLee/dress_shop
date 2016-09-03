package com.bit.dress_shop.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.dress_shop.domain.Member;
import com.bit.dress_shop.service.MemberService;

@Controller
public class MemberController {

	Logger log = Logger.getLogger(this.getClass());

	public MemberController() {
		System.out.println("MemberContrller() 생성자");
	}

	@Autowired
	private MemberService service;

	// 회원가입기능
	@RequestMapping(value = "/join_result", method = RequestMethod.POST)
	public String addmember(HttpServletRequest request, Model model) {

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String gender = request.getParameterValues("gender")[0];
		int zipcode = Integer.parseInt(request.getParameter("zipcode"));
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String telePhone = request.getParameter("telePhone");
		String cellPhone = request.getParameter("cellPhone");
		String email = request.getParameter("email");

		Member member = new Member();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setBirth(birth);
		member.setGender(gender);
		member.setZipcode(zipcode);
		member.setAddress1(address1);
		member.setAddress2(address2);
		member.setTelePhone(telePhone);
		member.setCellPhone(cellPhone);
		member.setEmail(email);

		service.addMember(member);
		model.addAttribute("result", member);

		return "add_outcome";
	}
	
	//회원정보수정
	@RequestMapping(value = "/modify_result", method = RequestMethod.POST)
	public String updateMember(HttpServletRequest request, Model model) {

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String gender = request.getParameterValues("gender")[0];
		int zipcode = Integer.parseInt(request.getParameter("zipcode"));
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String telePhone = request.getParameter("telePhone");
		String cellPhone = request.getParameter("cellPhone");
		String email = request.getParameter("email");

		Member member = new Member();
		
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setBirth(birth);
		member.setGender(gender);
		member.setZipcode(zipcode);
		member.setAddress1(address1);
		member.setAddress2(address2);
		member.setTelePhone(telePhone);
		member.setCellPhone(cellPhone);
		member.setEmail(email);

		service.updateMember(member);
		model.addAttribute("result", member);

		return "update_outcome";

	}
	
	//회원탈퇴
	@RequestMapping(value="/leave_result", method = RequestMethod.POST)
	public String deleteMember(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		Member member =  new Member();
		member.setId(id);
		member.setPassword(password);
		
		service.deleteMember(id, password);
		model.addAttribute("result", member);
		
		return "delete_outcome";
	}
	
	//회원정보
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String showMember(HttpServletRequest request, Model model) throws Exception {
		HttpSession session = request.getSession(false);
		
//		String id = (String) request.getSession().getId();

//		String id =request.getRequestedSessionId();
	
		Member member = (Member) session.getAttribute("result");
		String id = member.getId();
		
		Member memberInfo = (Member) service.showMember(id);
		model.addAttribute("result", memberInfo);
		
		return "update";
	}
	
}