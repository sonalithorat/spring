import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@ Controller //anotation
public class HelloWorldController {

	 @RequestMapping("/hellopage") 
	 public ModelAndView helloworld()
	 {
		 String message = "HELLO SPRING MVC HOW R U";  
		 return new ModelAndView("hellopage","message",message);
	 }
}
 