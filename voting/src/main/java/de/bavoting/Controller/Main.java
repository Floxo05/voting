package de.bavoting.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class Main {
	
	class StringSimple {
		
		public String str;
		
		public StringSimple(String str) {
			this.str = str;
		}
		
		public void setStr(String str) {
			this.str = str;
		}
		
		public String getStr() {
			return this.str;
		}
	}
	
	/**
	 * Dieser Controller erledigt Dinge
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String getMain(
			Model model) {
		
		StringSimple stringSimple = new StringSimple("Olaf");
		
		List<StringSimple> listSimples = new ArrayList<StringSimple>();
		
		listSimples.add(new StringSimple("Konrad"));
		listSimples.add(new StringSimple("Olaf"));
		
		stringSimple.setStr("Konrad");
		stringSimple.setStr("Olaf");
		
		model.addAttribute("objectList", listSimples);
		model.addAttribute("person", "Olaf Scholz");
		
//		return "result";
		return "view";
	}
}

