package calcul;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calcul")
public class CalculatorController {
	
	@GetMapping("/sum")
	public String sum() {
		
		return "sumForm";
	}
	
	@PostMapping("/sum")
	public String sum(Model m,int num1, int num2) {
		
		int result = num1+ num2;
		m.addAttribute("result",result);
		return "result";	
	}
}
