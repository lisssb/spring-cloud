package com.example.demo;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	Logger log = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("/hi/{name}")
	public  String hiThere( @PathVariable String name, ModelMap model) {

		//		public @ResponseBody String hiThere( Map model, @PathVariable String name) {
//		model.put("name", name);
		model.addAttribute("name", name);
		log.info("uuuu {}", name);
		return "hello";
	}
}
