package com.cg.placementmanagement.Placement.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.placementmanagement.Placement.model.College;
import com.cg.placementmanagement.Placement.service.CollegeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class CollegeController {
	
	 @Autowired
	    private CollegeService service;

	    @GetMapping("/collegeindex")
	    public String viewHomePage(Model model) {
	        List<College> listcollege = service.listAll();
	        model.addAttribute("listcollege", listcollege);
	        System.out.print("Get / ");	
	        return "collegeindex";
	    }

	    @GetMapping("/collegenew")
	    public String add(Model model) {
	        model.addAttribute("college", new College());
	        return "collegenew";
	    }

	    @RequestMapping(value = "/savecollege", method = RequestMethod.POST)
	    public String saveCollege(@ModelAttribute("college") College std) {
	        service.save(std);
	        return "redirect:/collegeindex";
	    }

	    @RequestMapping("/editcollege/{id}")
	    public ModelAndView showEditCollegePage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("collegenew");
	        College std = service.get(id);
	        mav.addObject("college", std);
	        return mav;
	        
	    }
	    @RequestMapping("/deletecollege/{id}")
	    public String deleteCollege(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/collegeindex";
	    }
	    
//	    @GetMapping("/index")
//	    public String index() {
//	        return "index"; //defect-details.html page name to open it
//	    }
	

}
