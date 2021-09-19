package com.cg.placementmanagement.Placement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.placementmanagement.Placement.model.Student;
import com.cg.placementmanagement.Placement.service.StudentService;
 

 
@Controller
public class StudentController {
	
	 @Autowired
	    private StudentService service;
 
	    @GetMapping("/studentindex")
	    public String viewHomePage(Model model) {
	        List<Student> liststudent = service.listAll();
	        model.addAttribute("liststudent", liststudent);
	        System.out.print("Get / ");	
	        return "studentindex";
	    }
 
	    @GetMapping("/newstudent")
	    public String add(Model model) {
	        model.addAttribute("student", new Student());
	        return "newstudent";
	    }
 
	    @RequestMapping(value = "/savestudent", method = RequestMethod.POST)
	    public String saveStudent(@ModelAttribute("student") Student std) {
	        service.save(std);
	        return "redirect:/studentindex";
	    }
 
	    @RequestMapping("/editstudent/{id}")
	    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("newstudent");
	        Student std = service.get(id);
	        mav.addObject("student", std);
	        return mav;
	        
	    }
	    @RequestMapping("/deletestudent/{id}")
	    public String deletestudent(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/studentindex";
	    }
	    
//	    @RequestMapping("/adminlogin")
//	    public String adminlogin() {
//	        return "adminlogin"; //defect-details.html page name to open it
//	    }
	    
	    
	    @RequestMapping(path = "/adminindex", method = RequestMethod.GET)
	    public String adminindex() {
	        return "adminindex"; //defect-details.html page name to open it
	    }
	    
//	    @RequestMapping("/newstudent")
//	    public String newstudent() {
//	        return "newstudent"; //defect-details.html page name to open it
//	    }
}