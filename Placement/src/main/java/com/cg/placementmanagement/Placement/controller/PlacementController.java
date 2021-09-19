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

import com.cg.placementmanagement.Placement.model.Placement;
import com.cg.placementmanagement.Placement.service.PlacementService;

@Controller
public class PlacementController {
	
	
	 @Autowired
	    private PlacementService service;

	    @GetMapping("/placementindex")
	    public String viewHomePage(Model model) {
	        List<Placement> listplacement = service.listAll();
	        model.addAttribute("listplacement", listplacement);
	        System.out.print("Get / ");	
	        return "placementindex";
	    }

	    @GetMapping("/placementnew")
	    public String add(Model model) {
	        model.addAttribute("placement", new Placement());
	        return "placementnew";
	    }

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String savePlacement(@ModelAttribute("placement") Placement plc) {
	        service.save(plc);
	        return "redirect:placementindex";
	    }

	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditPlacementPage(@PathVariable(name = "id") long id) {
	        ModelAndView mav = new ModelAndView("placementnew");
	        Placement plc = service.get(id);
	        mav.addObject("placement", plc);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteplacement(@PathVariable(name = "id") long id) {
	        service.delete(id);
	        return "redirect:/placementindex";
	    }

}
