/**
 * 
 */
package com.easydirect.easyafya.admin.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easydirect.easyafya.model.EasyAfyaAgeBrackets;
import com.easydirect.easyafya.model.EasyAfyaBenefitsCategory;
import com.easydirect.easyafya.model.EasyAfyaMembersCategory;
import com.easydirect.easyafya.model.EasyAfyaUsers;
import com.easydirect.easyafya.service.EasyAfyaAgeBracketsService;
import com.easydirect.easyafya.service.EasyAfyaBenefitsCategoryService;
import com.easydirect.easyafya.service.EasyAfyaMembersCategoryService;
import com.easydirect.easyafya.service.EasyAfyaUserService;

/**
 * @author MGathoka
 *
 */

@Controller
@RequestMapping(path="/users")
public class EasyAfyaUserController {
	
	private final static Logger LOGGER = Logger.getLogger(EasyAfyaUserController.class.getName());
	
	@Autowired
	private EasyAfyaUserService easyAfyaUserService;	
	private EasyAfyaAgeBracketsService easyAfyaAgeBracketsService;	
	private EasyAfyaMembersCategoryService easyAfyaMembersCategoryService;	
	private EasyAfyaBenefitsCategoryService easyAfyaBenefitsCategoryService;	
	//private EasyAfyaCategoryService esyAfyaCategoryService;
	
	@RequestMapping("")
	public String index(){
		return "admin/index";
	}
	
	@GetMapping(path="/users")
	public String adduser(Model model){
		
		model.addAttribute("users", new EasyAfyaUsers());
		model.addAttribute("usersList", easyAfyaUserService.findAll());
		return "admin/users";
	}
	
	
	@PostMapping("/users")	
	public  String saveUser(@Valid  EasyAfyaUsers easyAfyaUser, BindingResult bindingResult, Model model){
		if (bindingResult.hasErrors()) {
			
			LOGGER.info("Error");
			
			return "admin/index";
		}
		
				
		easyAfyaUserService.save(new EasyAfyaUsers(easyAfyaUser.getFisrtName(), 
				easyAfyaUser.getSecondName(), 
				easyAfyaUser.getLastName(),
				easyAfyaUser.getUserName()));
		
		//Retrieve the current list
		model.addAttribute("usersList", easyAfyaUserService.findAll());
		return "redirect:users";
		//return "redirect:users";
	}	
	
	
	@GetMapping(path="/agebrackets")
	public String addAgeBrackets(Model model){
		//List<EasyAfyaCategory> easyAfyaCategories = (List<EasyAfyaCategory>) esyAfyaCategoryService.findAll();
		model.addAttribute("agebracket", new EasyAfyaAgeBrackets());
		return "admin/agebrackets";
	}
	
	@PostMapping(path="/agebrackets")
	public String addAgeBrackets(@ModelAttribute EasyAfyaAgeBrackets easyAfyaAgeBrackets){
		
		easyAfyaAgeBracketsService.save(easyAfyaAgeBrackets);
		return"redirect:/agebrackets";
	}
	
	@GetMapping(path="/memberscategory")
	public String membesCategory(Model model){
		model.addAttribute("memberscategory", new EasyAfyaMembersCategory());
		return "admin/memberscategory";
	}
	
	@PostMapping(path="memberscategory")
	public String memberscategory(@ModelAttribute EasyAfyaMembersCategory afyaMembersCategory){
		
		easyAfyaMembersCategoryService.save(afyaMembersCategory);
		return "redirect:admin/memberscategory";
	}
	
	@GetMapping(path="/benefitcategory")
	public String benefitsCategory(Model model){
		model.addAttribute("benefitcategory", new EasyAfyaBenefitsCategory());
		return "admin/benefitcategory";
	}
	
	@PostMapping(path="/benefitcategory")
	public String benefitsCategory(@ModelAttribute EasyAfyaBenefitsCategory easyAfyaBenefitsCategory){
		easyAfyaBenefitsCategoryService.save(easyAfyaBenefitsCategory);
		return "redirect:admin/benefitcategory";
	}
}