package com.miniP.aaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.miniP.aaa.model.InputForm;
import com.miniP.aaa.service.IStoreService;

@Controller
public class StoreController {
	
	InputForm imf = new InputForm();
	
	@Autowired
	IStoreService storeService;
	
	
	
	@RequestMapping(value="/hr/count")
	public String Count(@RequestParam(value="deptid", required=false, defaultValue="0")int deptid, Model model) {
		if(deptid==0) {
			model.addAttribute("count", storeService.getEmpCount());
		}else {
			
			model.addAttribute("count", storeService.getEmpCount(deptid));
		}
		return "hr/count";
	}
	
	@RequestMapping(value="/hr/insert", method=RequestMethod.GET)
	public String insertEmp(Model model) {
		return "hr/insertform";
	}
	
	@RequestMapping(value="/hr/insert", method=RequestMethod.POST)
	public String insertEmp(InputForm imf, Model model) {
		//empService.insertEmp(emp);
		model.addAttribute("storename1", storeService.getresult(storeService.getcustList(imf)).get(0).getStoreName());
		model.addAttribute("location1", storeService.getresult(storeService.getcustList(imf)).get(0).getLocation());
		model.addAttribute("taste1", storeService.getresult(storeService.getcustList(imf)).get(0).getGrade_taste());
		model.addAttribute("price1", storeService.getresult(storeService.getcustList(imf)).get(0).getGrade_price());
		model.addAttribute("clean1", storeService.getresult(storeService.getcustList(imf)).get(0).getGrade_clean());
		model.addAttribute("service1", storeService.getresult(storeService.getcustList(imf)).get(0).getGrade_service());
		model.addAttribute("event1", storeService.getresult(storeService.getcustList(imf)).get(0).getEvent());
		
		model.addAttribute("storename2", storeService.getresult(storeService.getcustList(imf)).get(1).getStoreName());
		model.addAttribute("location2", storeService.getresult(storeService.getcustList(imf)).get(1).getLocation());
		model.addAttribute("taste2", storeService.getresult(storeService.getcustList(imf)).get(1).getGrade_taste());
		model.addAttribute("price2", storeService.getresult(storeService.getcustList(imf)).get(1).getGrade_price());
		model.addAttribute("clean2", storeService.getresult(storeService.getcustList(imf)).get(1).getGrade_clean());
		model.addAttribute("service2", storeService.getresult(storeService.getcustList(imf)).get(1).getGrade_service());
		model.addAttribute("event2", storeService.getresult(storeService.getcustList(imf)).get(1).getEvent());
		return "/hr/result";
		//return "redirect:/";
	}
	@RequestMapping(value="/hr/result", method=RequestMethod.GET)
	public String insertEmp2(InputForm imf, Model model) {
		//empService.insertEmp(emp);
		model.addAttribute("storename1", storeService.getresult(storeService.getcustList(imf)).get(0).getStoreName());
		model.addAttribute("location1", storeService.getresult(storeService.getcustList(imf)).get(0).getLocation());
		model.addAttribute("taste1", storeService.getresult(storeService.getcustList(imf)).get(0).getGrade_taste());
		model.addAttribute("price1", storeService.getresult(storeService.getcustList(imf)).get(0).getGrade_price());
		model.addAttribute("clean1", storeService.getresult(storeService.getcustList(imf)).get(0).getGrade_clean());
		model.addAttribute("service1", storeService.getresult(storeService.getcustList(imf)).get(0).getGrade_service());
		model.addAttribute("event1", storeService.getresult(storeService.getcustList(imf)).get(0).getEvent());
		
		model.addAttribute("storename2", storeService.getresult(storeService.getcustList(imf)).get(1).getStoreName());
		model.addAttribute("location2", storeService.getresult(storeService.getcustList(imf)).get(1).getLocation());
		model.addAttribute("taste2", storeService.getresult(storeService.getcustList(imf)).get(1).getGrade_taste());
		model.addAttribute("price2", storeService.getresult(storeService.getcustList(imf)).get(1).getGrade_price());
		model.addAttribute("clean2", storeService.getresult(storeService.getcustList(imf)).get(1).getGrade_clean());
		model.addAttribute("service2", storeService.getresult(storeService.getcustList(imf)).get(1).getGrade_service());
		model.addAttribute("event2", storeService.getresult(storeService.getcustList(imf)).get(1).getEvent());
		return "redirect:/";
	}
	
	
	
	/*
	public void setStoreService(IStoreService storeService) {
		this.storeService = storeService;
	}
	
	public void run(String name) {
		
		System.out.println("HelloController : " + storeService.run(name));
	}*/

}
