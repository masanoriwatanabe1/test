package com.norisuke.test.controllers;

import com.norisuke.test.services.NameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired private NameService service;
    
    // Comment Add
    // Comment2 Add
    @RequestMapping({"/","/index"})
    public ModelAndView get(ModelAndView mav){
        mav.addObject("names", service.getAll());
        mav.setViewName("index"); 
        return mav;
    }
}
