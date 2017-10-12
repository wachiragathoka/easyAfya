/**
 * 
 */
package com.uapom.easycomms.controler;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uapom.easycomms.model.SMS;
import com.uapom.easycomms.service.SMSService;

/**
 * @author MGathoka
 *
 */
@Controller
@RequestMapping(path = "/sms")
public class SMSController {

	private final static Logger LOGGER = Logger.getLogger(SMSController.class.getName());

	@Autowired
	private SMSService smsService;
	
	@Value("${spring.application.name}")
    String appName;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("appName", appName);
		return "index";
	}

	@RequestMapping(path = "/send", method = RequestMethod.POST)
	public String sendSMS(@Valid SMS sms, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {

			LOGGER.info("Error");
			return "index";
		}

		smsService.saveSMS(sms);
		return "sendSMS";
	}
}
