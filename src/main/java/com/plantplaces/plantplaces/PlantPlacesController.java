package com.plantplaces.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class PlantPlacesController {

//	@RequestMapping(value = "/start", method=RequestMethod.GET)
//	public String start()
//	{
//		return "start";
//	}
	
	@RequestMapping(value = "/start", method=RequestMethod.GET)
	public String read(Model model)
	{
		String test = "43 39.74 -84.51 A beautiful Eastern Redbud";
		
		model.addAttribute("specimenDTO", test);
		return "start";
	}
	
	@RequestMapping(value = "/start", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String readBlue()
	{
		return "start";
	}
	
	@RequestMapping(value = "/start", method=RequestMethod.GET, params= {"loyalty=silver"})
	public String readSilver()
	{
		return "start";
	}
	
	@RequestMapping(value = "/start", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJSON()
	{
		return "start";
	}
	
	@RequestMapping("/start")
	public String create()
	{
		return "start";
	}
	
}
