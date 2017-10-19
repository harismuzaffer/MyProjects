package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeHandler {

	@RequestMapping(value={"/","/home"})
	public  String home(Model model){
		model.addAttribute("user", "harismuzaffer");
		return "index";
	}
}
