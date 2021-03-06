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

import com.easydirect.easyafya.model.EasyAfya_AfyaImaraAgeBrackets;
import com.easydirect.easyafya.model.EasyAfyaBenefitsCategory;
import com.easydirect.easyafya.model.EasyAfyaCategory;
import com.easydirect.easyafya.model.EasyAfyaMembersCategory;
import com.easydirect.easyafya.service.EasyAfyaAgeBracketsService;
import com.easydirect.easyafya.service.EasyAfyaBenefitsCategoryService;
import com.easydirect.easyafya.service.EasyAfyaCategoryService;
import com.easydirect.easyafya.service.EasyAfyaMembersCategoryService;

/**
 * @author MGathoka
 *
 */

@Controller
@RequestMapping(path = "/easyaAfya")
public class EasyAfyaProductsController {

	private final static Logger LOGGER = Logger.getLogger(EasyAfyaUserController.class.getName());

	@Autowired
	private EasyAfyaCategoryService easyAfyaCategoryService;
	private EasyAfyaAgeBracketsService easyAfyaAgeBracketsService;
	private EasyAfyaMembersCategoryService easyAfyaMembersCategoryService;
	private EasyAfyaBenefitsCategoryService easyAfyaBenefitsCategoryService;

	@RequestMapping("")
	public String index() {
		return "admin/index";
	}

	/**
	 * @Description afyaImara, AfyaImara Juniors, AfyaImara seniors
	 * @param model
	 * @return
	 */
	@GetMapping(path = "/category")
	public String addEasyAfyaCategory(Model model) {

		
		
		model.addAttribute("easyafyacategory", new EasyAfyaCategory());
		model.addAttribute("CategoriesList", easyAfyaCategoryService.findAllEasyAfyaCategories());
		return "admin/easyafya_cat";
	}

	/**
	 * 
	 * @param easyAfyaCategory
	 * @param bindingResult
	 * @return
	 */
	@PostMapping(path = "/category")
	public String saveEasyAfyaCategory(@Valid EasyAfyaCategory easyAfyaCategory, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {

			LOGGER.info("Error");

			return "admin/index";
		}

		easyAfyaCategoryService.addCategory(easyAfyaCategory);

		return "redirect:category";
	}

	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping(path = "/agebrackets")
	public String addAgeBrackets(Model model) {
		model.addAttribute("agebracket", new EasyAfya_AfyaImaraAgeBrackets());
		model.addAttribute("agebracketList", easyAfyaAgeBracketsService.findAll());
		return "admin/agebrackets";
	}

	@PostMapping(path = "/agebrackets")
	public String addAgeBrackets(@Valid EasyAfya_AfyaImaraAgeBrackets easyAfyaAgeBrackets, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			LOGGER.info("Error");

			return "admin/index";
		}

		easyAfyaAgeBracketsService.save(new EasyAfya_AfyaImaraAgeBrackets(easyAfyaAgeBrackets.getEasyafya_category_id(),
				easyAfyaAgeBrackets.getCategoryAgeLowerLimit(), easyAfyaAgeBrackets.getCategoryAgeUpperLimit()));
		return "redirect:agebrackets";
	}
	
	
	@GetMapping(path = "/memberscategory")
	public String membesCategory(Model model) {
		model.addAttribute("memberscategory", new EasyAfyaMembersCategory());
		model.addAttribute("MembersCategoryList", easyAfyaMembersCategoryService.findAll());
		return "admin/memberscategory";
	}
	
	
	@PostMapping(path = "memberscategory")
	public String memberscategory(@ModelAttribute EasyAfyaMembersCategory afyaMembersCategory) {

		easyAfyaMembersCategoryService.addMemberCategory(afyaMembersCategory);
		return "redirect:memberscategory";
	}
	

	@GetMapping(path = "/benefitcategory")
	public String benefitsCategory(Model model) {
		model.addAttribute("benefitcategory", new EasyAfyaBenefitsCategory());
		return "admin/benefitcategory";
	}

	@PostMapping(path = "/benefitcategory")
	public String benefitsCategory(@ModelAttribute EasyAfyaBenefitsCategory easyAfyaBenefitsCategory) {
		easyAfyaBenefitsCategoryService.addEasyAfyaBenefitCategory(easyAfyaBenefitsCategory);
		return "redirect:benefitcategory";
	}
}
