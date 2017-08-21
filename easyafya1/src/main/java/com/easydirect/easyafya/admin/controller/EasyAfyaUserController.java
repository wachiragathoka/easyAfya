/**
 * 
 */
package com.easydirect.easyafya.admin.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easydirect.easyafya.model.EasyAfyaUsers;
import com.easydirect.easyafya.repo.interfaces.EasyAfyaUserRepo;

/**
 * @author MGathoka
 *
 */

@Controller
//@RequestMapping(path="/users")
public class EasyAfyaUserController {
	
	private final static Logger LOGGER = Logger.getLogger(EasyAfyaUserController.class.getName());
	
	@Autowired
	private EasyAfyaUserRepo easyAfyaUserRepo;
	
	@GetMapping(path="/users")
	public String adduser(Model model){
		
		model.addAttribute("users", new EasyAfyaUsers());
		LOGGER.info("return form");
		return "admin/users";
	}
	
	@PostMapping("/users")
	
	public @ResponseBody String saveUser(@ModelAttribute  EasyAfyaUsers easyAfyaUsers){
		
		//easyAfyaUsers.setFisrtName(fisrtName);
		return "Ok";
	}
}
