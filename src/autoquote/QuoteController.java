package autoquote;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import autoquote.Quote;

@Controller
@RequestMapping(value="/quote")
public class QuoteController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String eligibilityform(Model model, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		model.addAttribute("quote", new Quote());
		model.addAttribute("quoteNum", "456789");
		model.addAttribute("quotedPrem", "250.0");
		return "quote";
		
	}
	
}
