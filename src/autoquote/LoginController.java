package autoquote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import autoquote.LoginDAO;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import autoquote.Applicant;
import autoquote.Login;
import autoquote.LoginDAO;
@SuppressWarnings("unused")
@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	String username, password;
	
	@RequestMapping(method=RequestMethod.GET)
	public String loginform(Map<String, Object> model, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		Login a = new Login();
		model.put("login", a);
		return "login";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String loginview(@ModelAttribute("login") @Valid Login login,BindingResult result, Map<String, Object> model) {
		
		if(result.hasErrors()){
			return "login";
		} 
		
		ApplicationContext context;
	    context =  new ClassPathXmlApplicationContext("beans.xml");
		//@Autowired
	    LoginDAO lDAO = (LoginDAO) context.getBean("logindao");
	    String userName = login.getUsername();
	    String passWord = login.getPassword();
	    
	    if(lDAO.selectDAO(userName, passWord)) {
	    	
	    	Applicant b = new Applicant();
			model.put("applicant", b);
			((AbstractApplicationContext)context).close();
			return "applicant";
	    	
	    } else {
	    	
	    	((AbstractApplicationContext)context).close();
	    	login.setUsername("");
	    	login.setPassword("");
	    	model.put("errval", "User name and Password combination did not match");
	    	return "login";
	    }
	    
    }

}