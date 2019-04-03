package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.Validation.Valid;
import com.cognizant.Validation.ValidM;
import com.cognizant.model.User;
import com.cognizant.model.UserM;
import com.cognizant.service.UserService;

@Controller
public class RegistrationController {
	
	public RegistrationController(){
		System.out.println("**********RegistrationController1***********");
	}

	 @Autowired
	  public UserService userService;
	  
	  @Autowired
	  private Valid validator;
	  @Autowired
	  private ValidM validatorM;
	  @RequestMapping("memberregistration.htm")  
	  public ModelAndView showFormM(){  
	       
	      return new ModelAndView("memberregistration"); 
	  }
	  @RequestMapping("adminregistration.htm")  
	  public ModelAndView showFormA(){  
	       
	      return new ModelAndView("adminregistration"); 
	  }
	  @ModelAttribute("user")
	  public User defaultUser(){
		  User user=new User();
		  return user;
	  }
	  
	  @ModelAttribute("userM")
	  public UserM defaultUserM(){
		  UserM user=new UserM();
		  return user;
	  }
	  @RequestMapping(value = "registerProcess.htm", method = RequestMethod.POST)
	  public ModelAndView addUser(@ModelAttribute("user") User user,Errors error) 
	  {
		 
		  ModelAndView mv=new ModelAndView();
	  ValidationUtils.invokeValidator(validator, user, error);
		  
		  if(error.hasErrors())
		  {
			  mv.setViewName("adminregistration");
		  }
		 
		  else{
		  if(userService.register(user)==1)
			  mv.setViewName("RegSuccesfull");
		  else
		  mv.setViewName("index");
		  }
		  return mv;
	 }
	  
	  @RequestMapping(value = "registerProcessM.htm", method = RequestMethod.POST)
	  public ModelAndView addUserM(@ModelAttribute("userM") UserM user,Errors error) 
	  {
		 
		  ModelAndView mv=new ModelAndView();
		  ValidationUtils.invokeValidator(validatorM, user, error);
		 
		  if(error.hasErrors())
		  {
			  mv.setViewName("memberregistration");
		  }
		  else
		  {
		  
	  if(userService.registerM(user)==1)
	  mv.setViewName("RegSuccesfullM");
	  else
		  mv.setViewName("index");
		  }
	return mv;
	 
	  }


}
