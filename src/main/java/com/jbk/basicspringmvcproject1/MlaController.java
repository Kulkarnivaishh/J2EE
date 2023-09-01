package com.jbk.basicspringmvcproject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MlaController {
	@GetMapping("fetchmladetail")
	ModelAndView loadMlaDetail() {
		Mla mla = new Mla("aaa", "pune");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("mladetail");
		mv.addObject("data", mla);
		return mv;
	}
}
