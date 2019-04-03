package com.cognizant.Validation;
import com.cognizant.model.*;
import com.cognizant.service.UserServiceImpl;

import java.util.regex.Matcher;    
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;    
import org.springframework.validation.ValidationUtils;    
import org.springframework.validation.Validator;    
        @Component
public class ValidM implements Validator{
        	@Autowired
        	private UserServiceImpl service;
        	private Pattern pattern;    
        	 private Matcher matcher;    
        	    
        	 private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"    
        	   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";   
        	 private static final String DATE_PATTERN = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
        	 private static final String PASSWORD_PATTERN = 
        	         "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";
        	 String ID_PATTERN = "[0-9]+";    
        	 String ZIP_PATTERN = "[0-9]+";
        	 String STRING_PATTERN = "[a-zA-Z]+";    
        	 String MOBILE_PATTERN = "[0-9]{10}";   
        	 @Override
        	 public boolean supports(Class<?> arg0) {
        	 
        	 	return arg0.equals(UserM.class);
        	 }  
        	 @Override
        	 public void validate(Object target, Errors errors)
        	 {    
        		 
        	  UserM user = (UserM) target;   
        	  if((user.getAge())<18 || (user.getAge()>120))
        	  {
        		  System.out.println("age btw 18 and 120");
        		  errors.rejectValue("age","memberage.incorrect");
        	  }
        	  
        	  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dob",    
   				    "memberdaterequired.dob"); 
      	  if (!(user.getDob() != null && user.getDob().isEmpty())) {    
 			   pattern = Pattern.compile(DATE_PATTERN);    
 			   matcher = pattern.matcher(user.getDob());    
 			   if (!matcher.matches()) {    
 			    errors.rejectValue("dob", "memberdate.incorrect");    
 			   }    
 			  }    
        	  
        	  
        	  String id=Integer.toString(user.getMemberId());
    		  if (id!= null) {    
    		   pattern = Pattern.compile(ID_PATTERN);   
    		   System.out.println("id!=null");
    		   matcher = pattern.matcher(id.toString());    
    		   if (!matcher.matches()) {    
    			   System.out.println("not correct");
    		    errors.rejectValue("memberId","memberId.incorrect");    
    		   }        
    		   if (id.toString().length() > 5) {  
    			   System.out.println("length>5");
    		    errors.rejectValue("memberId","memberId.exceed");    
    		   }    
    		  } 
    		  
    		  ValidationUtils.rejectIfEmpty(errors, "zipCode","memberrequired.zipCode");  
    		  String zip=Integer.toString(user.getZipCode());
    		  if (zip!= null) {    
    		   pattern = Pattern.compile(ZIP_PATTERN);   
    		 
    		   matcher = pattern.matcher(zip.toString());    
    		   if (!matcher.matches()) {    
    			   
    		    errors.rejectValue("zipCode","memberzipCode.incorrect");    
    		   }        
    		   if (zip.toString().length() > 6) {  
    			   System.out.println("length>5");
    		    errors.rejectValue("zipCode","memberzipCode.exceed");    
    		   }    
    		  } 
    		  
    		  ValidationUtils.rejectIfEmpty(errors, "state","memberrequired.state");
    		  ValidationUtils.rejectIfEmpty(errors, "city","memberrequired.city");
    		  ValidationUtils.rejectIfEmpty(errors, "addressLine1","memberrequired.addressLine1");
    		 
    		  ValidationUtils.rejectIfEmpty(errors, "coverageStartDate","memberrequired.coverageStartDate");
    		  ValidationUtils.rejectIfEmpty(errors, "coverageEndDate","memberrequired.coverageEndDate");
    		  ValidationUtils.rejectIfEmpty(errors, "planCode","memberrequired.planCode");
        	  
        	  
        	  ValidationUtils.rejectIfEmpty(errors, "firstName","required.firstName");   
        	  
        	  if (!(user.getFirstName() != null && user.getFirstName().isEmpty())) {    
        		   pattern = Pattern.compile(STRING_PATTERN);    
        		   matcher = pattern.matcher(user.getFirstName());    
        		   if (!matcher.matches()) {    
        		    errors.rejectValue("firstName", "memberfirstname.containNonChar");    
        		   }    
        		  }    
        	  
        	  
        	  
        	  ValidationUtils.rejectIfEmpty(errors, "lastName","memberrequired.lastName");
        	  
        	  if (!(user.getLastName() != null && user.getLastName().isEmpty())) {    
        		   pattern = Pattern.compile(STRING_PATTERN);    
        		   matcher = pattern.matcher(user.getLastName());    
        		   if (!matcher.matches()) {    
        		    errors.rejectValue("lastName", "memberlastname.containNonChar");    
        		   }    
        		  } 
        	  
        	  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId",    
     				    "memberrequired.emailId"); 
        	  if (!(user.getEmailId() != null && user.getEmailId().isEmpty())) {    
   			   pattern = Pattern.compile(EMAIL_PATTERN);    
   			   matcher = pattern.matcher(user.getEmailId());    
   			   if (!matcher.matches()) {    
   			    errors.rejectValue("emailId", "memberemailId.incorrect");    
   			   }    
   			  }    
   		  
   		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",    
   				    "memberrequired.password"); 
   		  
   		  if (!(user.getPassword() != null && user.getPassword().isEmpty())) {    
   			   pattern = Pattern.compile(PASSWORD_PATTERN);    
   			   matcher = pattern.matcher(user.getPassword());    
   			   if (!matcher.matches()) {    
   			    errors.rejectValue("password", "memberpassword.incorrect");    
   			   }    
   			  }    
   		  
   		  
   		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contact",    
   				    "memberrequired.contact");    
   				    
   				// phone number validation 
   		  String c=Long.toString(user.getContact());
   				  if (!(c != null && c.isEmpty())) {    
   				   pattern = Pattern.compile(MOBILE_PATTERN);    
   				   matcher = pattern.matcher(c);    
   				   if (!matcher.matches()) {    
   				    errors.rejectValue("contact", "membercontact.incorrect"  
   				      );    
   				   }    
   				  }    
   				  
   				  
   				  
   				  
   				   
   						    
   						// alternate phone number validation 
   				
   				  String d=Long.toString(user.getAltContact());
   						  if (!(d != null && d.isEmpty())) {    
   						   pattern = Pattern.compile(MOBILE_PATTERN);    
   						   matcher = pattern.matcher(d);    
   						   if (!matcher.matches()) {    
   						    errors.rejectValue("altContact", "memberaltContact.incorrect");    
   						   }    
   						  }    

        	  
        	  
        	  
        	  
}
}
