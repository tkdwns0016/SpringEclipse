package calcul;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calcul")
public class CalculatorController {
	
	@GetMapping("/result")
	public String sum() {
		
		return "result";
	}
	
	@GetMapping("sum")
	public String sum1() {
		return "sumForm";
	}
	@GetMapping("sub")
	public String sub1() {
		return "subForm";
	}
	@GetMapping("mul")
	public String mul1() {
		return "mulForm";
	}
	@GetMapping("div")
	public String div1() {
		return "divForm";
	}
	
	
	@PostMapping("/sum")
	public String sum(Model m, int num1, int num2) {
		
		int result = num1 + num2;
		m.addAttribute("result",result);
		return "result";	
	}
	
	@PostMapping("/sub")
	public String sub(Model m, int num1, int num2) {
		int result = num1 - num2;
		m.addAttribute("result",result);
		return "result";
	}
	
	@PostMapping("/mul")
	public String mul(Model m, int num1, int num2) {
		int result = num1 * num2;
		m.addAttribute("result",result);
		return "result";
	}
	
	@PostMapping("/div")
	public String div(Model m, int num1, int num2) {
		double result = (double)num1 / num2;
		m.addAttribute("result",result);
		return "result";
	}
	
	
	
}
