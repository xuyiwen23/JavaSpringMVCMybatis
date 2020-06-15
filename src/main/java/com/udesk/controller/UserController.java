package com.udesk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.udesk.entity.User;
import com.udesk.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	@Qualifier("userServiceImpl")
	UserService userService;
	
	@RequestMapping(value="/users",  method = RequestMethod.GET)
	public String ShowAllUser(ModelMap  modelMAp){
		List<User> userList = userService.findAll();
		modelMAp.addAttribute("userList", userList);
		return "index";
	}
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
	public String CreateUser(User user){ 
		Integer rows = userService.createUser(user);
		System.out.println("user create 成功"+rows);
		return "redirect:/users";
	}
	
	@RequestMapping(value="/user/{id}", method = RequestMethod.GET)
	public String toUpdate(@PathVariable("id") Integer id, ModelMap  modelMAp) {
		User user = userService.findOne(id);
		System.out.println(user);
		modelMAp.addAttribute("user", user);
		return "update";
	}
	
	@RequestMapping(value="/user", method = RequestMethod.PUT)
	public String UpdateUser(User user){ 
		Integer rows = userService.saveUser(user);
		System.out.println("user update 成功"+rows);
		return "redirect:/users";
	}
	
	@RequestMapping(value="/user/{id}", method = RequestMethod.DELETE)
	public String DeleteeUser(@PathVariable("id") Integer id){ 
		Integer rows = userService.deleteUser(id);
		System.out.println("user delete 成功"+rows);
		return "redirect:/users";
	}

	
}
