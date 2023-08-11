package de.bavoting.Controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class ResultCollection {
	
	private int voteYes = 0;
	private int voteNo = 0;
	
	/**
	 * 
	 * @param btn
	 * @param model
	 * @return
	 */
	@RequestMapping("/result")
	public String getResult(@RequestParam(required = false) String btn, Model model) {
		
		System.out.println(btn.equals("yes"));
		
		if (btn.equals("yes")) {
			voteYes++;
		} else if (btn.equals("no")) {
			voteNo++;
		}
		
		System.out.println(voteYes);
				
		model.addAttribute("votingYes", voteYes);
		model.addAttribute("votingNo", voteNo);
	
		return "result"; 
	}
}