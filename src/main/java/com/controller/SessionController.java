package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.SignupBean;
import com.bean.UserBean;
import com.dao.UserDao;

//singleton design pattern 
@Controller
public class SessionController {

	// open Signup.jsp
	// url
	@Autowired
	UserDao userDao;

	@GetMapping("/signup")
	public String signup(Model model) {
		System.out.println("signup()");
		List<UserBean> users = userDao.getAllUsers();
		model.addAttribute("users",users);
		return "Signup";
	}

	@GetMapping("/login")
	public String login() {
		return "Login";
	}

	@PostMapping("/saveuser")
	public String saveUser(SignupBean sBean, Model model) {
		// getParameter -> ioc -> spring
		System.out.println(sBean.getEmail());
		System.out.println(sBean.getFirstName());

		// validation

		// save into database
		userDao.addUser(sBean);
		model.addAttribute("user", sBean);
		return "redirect:/signup";
	}

	@GetMapping("/users")
	public String users(Model model) {

		List<UserBean> users = userDao.getAllUsers();
		model.addAttribute("users",users);
		return "ListUser";
	}
}
