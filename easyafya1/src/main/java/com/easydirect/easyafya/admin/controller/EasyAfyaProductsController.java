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

import com.easydirect.easyafya.model.EasyAfyaCategory;
import com.easydirect.easyafya.service.EasyAfyaCategoryService;

/**
 * @author MGathoka
 *
 */

@Controller
@RequestMapping(path="/easyaAfya")
public class EasyAfyaProductsController {

	private final static Logger LOGGER = Logger.getLogger(EasyAfyaUserController.class.getName());
	
	@Autowired
	private EasyAfyaCategoryService easyAfyaCategoryService;
	
	@RequestMapping("")
	public String index() {
		return "admin/index";
	}
	
	/**
	 * @Description afyaImara, AfyaImara Juniors, AfyaImara seniors
	 * @param model
	 * @return
	 */
	@GetMapping(path="/category")
	public String addEasyAfyaCategory(Model model){
		
		model.addAttribute("easyafyacategory", new EasyAfyaCategory());
		return "admin/easyafya_cat";
	}
	
	@PostMapping(path="/category")
	public String saveEasyAfyaCategory(@ModelAttribute EasyAfyaCategory easyAfyaCategory){
		easyAfyaCategoryService.save(easyAfyaCategory);
		return "redirect:easyafya_cat";
	}
}
