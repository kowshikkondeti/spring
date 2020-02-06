package helloworld;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/hello6")
public class Javacontroller {
	@RequestMapping("/hello5")
	public ModelAndView object(){
		return new ModelAndView("object","msg","hi sakshi");
		
	}
	
	@RequestMapping("/welcome")
	 public ModelAndView hello(){    	
	 	return new ModelAndView("welcome");
	 }

	@RequestMapping("/add")
	public ModelAndView hello1(){    	
 	return new ModelAndView("welcomadd");
 }
   @RequestMapping("/hello")
   ModelAndView hello2(){	   
	   return new ModelAndView("hello", "msg", "Hello Spring MVC ..");
   }
   @RequestMapping("/hello3")
   public ModelAndView hello3() {
   	System.out.println("Reached here");
   	return new ModelAndView("hello3", "msg", "Hello message ...");
   }
	
	@RequestMapping("/hello4/add")
	public String hello4() {
		return "add1";
	}
}