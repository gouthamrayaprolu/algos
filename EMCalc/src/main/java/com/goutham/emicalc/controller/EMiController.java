package com.goutham.emicalc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.goutham.emicalc.model.EMIModel;
import com.goutham.emicalc.service.EMICalc;

@Controller
public class EMiController {

	@Autowired
	private EMICalc emicalc;
	
	//rest
	@GetMapping("/calculateemi/{p}/{r}/{n}")
	@ResponseBody
	public List<EMIModel> calculateEmi(@PathVariable double p, @PathVariable double r, @PathVariable double n) {
		
		return emicalc.calcEmiAllMonths(p, r, n);
	}
		
	//for jsp
	@RequestMapping("/")
	public String home() {

		return "home.jsp";
	}
	
	
	//for jsp
	@RequestMapping(path="/calEMI")
	public ModelAndView getAlien(@RequestParam double p, @RequestParam double r, @RequestParam double n) {
		ModelAndView mv = new ModelAndView("show.jsp");
		List<EMIModel> models = emicalc.calcEmiAllMonths(p, r, n);
		mv.getModelMap().addAttribute("models", models);
		mv.addObject(models);
		return mv;
	}

}
