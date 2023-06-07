package com.jatin.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jatin.demo.dao.SourceRepo;
import com.jatin.demo.model.Source;
  
@RestController
public class Mycontroller {
	private int priorityid;
      
    @Autowired 
    private SourceRepo repo;
      
    // Save method is predefine method in Mongo Repository
    // with this method we will save user in our database
    
    @RequestMapping("/")
    public ModelAndView home() {
    	System.out.println("here");
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("mainhome.jsp");
        return mv;
    }
    
    
    
    @RequestMapping("/gotoadd")
    public ModelAndView gotoadd() {
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("home.jsp");
        return mv;
    }
    @RequestMapping("/addSource")
    public ModelAndView addUser(Source source) {
    	System.out.println(source);
    	repo.save(source);
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("home.jsp");
    	//mv.addObject("obj",source);
        return mv;
    }
    @RequestMapping("/getClear")
	public ModelAndView getSource() {
    	repo.deleteAll();
		ModelAndView mv=new ModelAndView();
		List<Source> source=repo.findAll();
		System.out.println(source);
		mv.setViewName("home.jsp");
		return mv;
	}
    

    
    @RequestMapping("/gotopriority")
    public ModelAndView gotopriority() {
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("priority.jsp");
    	List<Source> source=repo.findAll();
    	mv.addObject("obj",source);
        return mv;
    }
    @RequestMapping("/setpriority")
    public ModelAndView setpriority(int id) {
    	this.priorityid=id;
    	//kafka producer logic here
    	
    	
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("priority.jsp");
    	List<Source> source=repo.findAll();
    	mv.addObject("obj",source);
        return mv;
    }
    
    
    
    
    @RequestMapping("/gotofetch")
    public ModelAndView gotofetch() {
    	//kafka consumer logic here 
    	
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("show.jsp");
        return mv;
    }
    @RequestMapping("/getSource")
	public ModelAndView getSource(@RequestParam int sid) {
		ModelAndView mv=new ModelAndView();
		//List<Source> source=userRepo.findAll();;
		Source source=repo.findById(sid).orElse(new Source());
		mv.addObject("obj",source);
		System.out.println(source);
		mv.setViewName("show.jsp");
		return mv;
	}
    
    
}