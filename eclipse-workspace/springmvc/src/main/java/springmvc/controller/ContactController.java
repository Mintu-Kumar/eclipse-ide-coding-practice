package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String contact() {
		
		return "contact";
		
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
	{
		
		if(user.getUsername().isBlank()) {
			
			return "redirect:/contact";
		}
		this.userService.createUser(user);
		model.addAttribute("user",user);
		/*
		 * model.addAttribute("name", userName); model.addAttribute("email",userEmail);
		 * model.addAttribute("password",userPassword);
		 */
		
		/*
		 * String email = (String)request.getParameter("email");
		 * System.out.println(email);
		 */
		model.addAttribute("msg","User registration successfull"); 
		return "success";
	}

}



/*@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail,
			@RequestParam("username") String userName,
			@RequestParam("userpassword") String userPassword, Model model)
	{
		System.out.println(userEmail);
		System.out.println(userName);
		System.out.println(userPassword);
		
		User user =  new User();
		user.setEmail(userEmail);
		user.setUsername(userName);
		user.setPassword(userPassword);
		System.out.println(user);
		
		model.addAttribute("user",user);
		
		 model.addAttribute("name", userName); model.addAttribute("email",userEmail);
		 model.addAttribute("password",userPassword);
		 
		
		
		  String email = (String)request.getParameter("email");
		 System.out.println(email);
		 
		return "success";
	}*/

