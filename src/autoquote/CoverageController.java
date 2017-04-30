package autoquote;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.lang.Math;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import autoquote.Coverage;
import autoquote.CoverageDAO;
import autoquote.Quote;
import java.util.Random;
@SuppressWarnings("unused")
@Controller
@RequestMapping(value="/coverage")
public class CoverageController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String coverageform(Model model, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		model.addAttribute("coverage", new Coverage());
		return "coverage";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String coverageview(@Valid @ModelAttribute("coverage") Coverage e,BindingResult result, Map<String, Object> model) {
		
			if(result.hasErrors()){
			return "coverage";
		}
		
		
		ApplicationContext context;
	    context =  new ClassPathXmlApplicationContext("beans.xml");
		//@Autowired
	    CoverageDAO eDAO = (CoverageDAO) context.getBean("covergedao");
	    if(eDAO.insert(e)) {
	    	
	    	((AbstractApplicationContext)context).close();
		    Quote r = new Quote();
		    model.put("quote", r);
			model.put("quoteNum",r.getQuoteNumber());
			model.put("quotedPrem", e.getQuotedPremium());
			return "quote";
	    }
			else {
	    	
	    	((AbstractApplicationContext)context).close();
	    	model.put("errval", "Encountered a Exception when inserting data into coverage table");
	    	return "coverage";
	    	
	    }
	    
    
	}
}



