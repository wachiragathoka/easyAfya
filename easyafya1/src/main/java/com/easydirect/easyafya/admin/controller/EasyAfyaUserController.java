/**
 * 
 */
package com.easydirect.easyafya.admin.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easydirect.easyafya.model.EasyAfyaAgeBrackets;
import com.easydirect.easyafya.model.EasyAfyaBenefitsCategory;
import com.easydirect.easyafya.model.EasyAfyaCategory;
import com.easydirect.easyafya.model.EasyAfyaMembersCategory;
import com.easydirect.easyafya.model.EasyAfyaUsers;
import com.easydirect.easyafya.repo.EasyAfyaAgeBracketsRepo;
import com.easydirect.easyafya.repo.EasyAfyaBenefitsCategoryRepo;
import com.easydirect.easyafya.repo.EasyAfyaCategoryRepo;
import com.easydirect.easyafya.repo.EasyAfyaMembersCategoryRepo;
import com.easydirect.easyafya.repo.EasyAfyaUserRepo;
import com.easydirect.easyafya.repoImpl.EasyAfyaCategoryRepoImpl;

/**
 * @author MGathoka
 *
 */

@Controller
@RequestMapping(path="/users")
public class EasyAfyaUserController {
	
	private final static Logger LOGGER = Logger.getLogger(EasyAfyaUserController.class.getName());
	
	@Autowired
	private EasyAfyaUserRepo easyAfyaUserRepo;
	
	@Autowired
	private EasyAfyaAgeBracketsRepo easyAfyaAgeBracketsRepo;
	
	@Autowired
	private EasyAfyaMembersCategoryRepo easyAfyaMembersCategoryRepo;
	
	@Autowired
	private EasyAfyaBenefitsCategoryRepo easyAfyaBenefitsCategoryRepo;
	
	
	private EasyAfyaCategoryRepoImpl esyAfyaCategoryRepoImpl;
	
	@RequestMapping("")
	public String index(){
		return "admin/index";
	}
	
	@GetMapping(path="/users")
	public String adduser(Model model){
		
		model.addAttribute("users", new EasyAfyaUsers());
		//LOGGER.info("return form");
		return "admin/users";
	}
	
	@PostMapping("/users")	
	//@ResponseBody
	public  String saveUser(@ModelAttribute  EasyAfyaUsers easyAfyaUsers){
		
		easyAfyaUserRepo.save(easyAfyaUsers);
		return "redirect:/users";
	}
	
	@GetMapping(path="/agebrackets")
	public String addAgeBrackets(Model model){
		List<EasyAfyaCategory> easyAfyaCategories = (List<EasyAfyaCategory>) esyAfyaCategoryRepoImpl.findAll();
		model.addAttribute("agebracket", new EasyAfyaAgeBrackets());
		return "admin/agebrackets";
	}
	
	@PostMapping(path="/agebrackets")
	public String addAgeBrackets(@ModelAttribute EasyAfyaAgeBrackets easyAfyaAgeBrackets){
		
		easyAfyaAgeBracketsRepo.save(easyAfyaAgeBrackets);
		return"redirect:/agebrackets";
	}
	
	@GetMapping(path="/memberscategory")
	public String membesCategory(Model model){
		model.addAttribute("memberscategory", new EasyAfyaMembersCategory());
		return "admin/memberscategory";
	}
	
	@PostMapping(path="memberscategory")
	public String memberscategory(@ModelAttribute EasyAfyaMembersCategory afyaMembersCategory){
		
		easyAfyaMembersCategoryRepo.save(afyaMembersCategory);
		return "redirect:/memberscategory";
	}
	
	@GetMapping(path="/benefitcategory")
	public String benefitsCategory(Model model){
		model.addAttribute("benefitcategory", new EasyAfyaBenefitsCategory());
		return "admin/benefitcategory";
	}
	
	@PostMapping(path="/benefitcategory")
	public String benefitsCategory(@ModelAttribute EasyAfyaBenefitsCategory easyAfyaBenefitsCategory){
		easyAfyaBenefitsCategoryRepo.save(easyAfyaBenefitsCategory);
		return "redirect:/benefitcategory";
	}
}