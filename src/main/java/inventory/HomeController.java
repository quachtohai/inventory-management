package inventory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/hello")
	public String index() {
		return "index";
	}
	@GetMapping("/")
	public String index1() {
		return "index";
	}
	
}
