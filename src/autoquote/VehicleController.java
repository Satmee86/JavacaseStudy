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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import autoquote.Coverage;
import autoquote.Vehicle;
import autoquote.VehicleDAO;

@Controller
@RequestMapping(value="/vehicle")
public class VehicleController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String vehicleform(Model model, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		model.addAttribute("vehicle", new Vehicle());
		return "vehicle";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String vehicleview(@Valid @ModelAttribute("vehicle") Vehicle c,BindingResult result, Map<String, Object> model) {
		
		//System.out.println(result.getErrorCount());
		
		if(result.hasErrors()){
			return "vehicle";
		}
		
		ApplicationContext context;
	    context =  new ClassPathXmlApplicationContext("beans.xml");
		//@Autowired
	    VehicleDAO iDAO = (VehicleDAO) context.getBean("vehicledao");
	    if(iDAO.insert(c)) {
	    	
	    	((AbstractApplicationContext)context).close();
		    Coverage e = new Coverage();
			model.put("coverage", e);
			return "coverage";
			
	    } else {
	    	
	    	((AbstractApplicationContext)context).close();
	    	model.put("errval", "Encountered a Exception when inserting data into vehicle table");
	    	return "vehicle";
	    }
	    
		
        
    }


}