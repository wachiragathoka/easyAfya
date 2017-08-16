/**
 * 
 */
package com.easydirect.easyafya.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easydirect.easyafya.model.EasyAfyaUsers;
import com.easydirect.easyafya.repo.interfaces.EasyAfyaUserRepo;

/**
 * @author MGathoka
 *
 */
@Controller
@RequestMapping(path="/users")
public class EasyAfyaUserController {

	@Autowired
	private EasyAfyaUserRepo easyAfyaUserRepo;
	
	@Autowired
	private EasyAfyaUsers users;
	
	@GetMapping(path="/addUserform")
	public String adduser(Model model){
		
		model.addAttribute("addUserform", new EasyAfyaUsers());
		return "admin/users";
	}
	
	@PostMapping("/addUserform")
	public String saveUser(@ModelAttribute  EasyAfyaUsers easyAfyaUsers){
		return "users";
	}
}
