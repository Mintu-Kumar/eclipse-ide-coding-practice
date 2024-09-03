package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name","Mintu kumar");
		System.out.println("This is home url");
		List<String> friends = new ArrayList<String>();
		
		friends.add("Mintu");
		friends.add("Chintu");
		friends.add("Amit");
		friends.add("Vikash");
		model.addAttribute("f",friends);
		return "index";
	}

}
