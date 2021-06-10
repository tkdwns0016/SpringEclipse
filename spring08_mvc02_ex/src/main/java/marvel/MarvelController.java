package marvel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/marvel")
public class MarvelController {
	
	@Autowired
	MarvelService marvelService;
	
	@GetMapping("/list")
	public String marvelList(Model m) {
		List<Marvel> marvelList = marvelService.selectAll();
		m.addAttribute("marvelList",marvelList);
		return "list";
	}
	
	@GetMapping("/insert")
	public String showInsertMovie() {
//		marvelService.insertMovie(marvel);
		return "inputMovie";
	}
	
	@PostMapping("/insert")
	public String insertMovie(Model m,Marvel marvel) {
		marvel = marvelService.insertMovie(marvel);
		m.addAttribute("marvel", marvel);
		return "result";
	}
	
	@GetMapping("/update")
	public String showUpdateMovie(Model m, int marvelId) {
		Marvel marvel = marvelService.selectOneMovie(marvelId);
		m.addAttribute("marvel", marvel);
		return "updateForm";
	}
	
	@PostMapping("/update")
	public String updateMovie(Model m,Marvel marvel) {
		marvel = marvelService.updateMovie(marvel);
		
		marvel = marvelService.selectOneMovie(marvel.getMarvelId());
		
		m.addAttribute("marvel", marvel);
		
		return "result";
	}
	
	@GetMapping("/delete")
	public String deleteMovie(Model m,int marvelId) {
		System.out.println(marvelId);
		String result = marvelService.deleteMovie(marvelId);
		System.out.println(result);
		m.addAttribute("result", result);
		return "deleteResult";
	}
	
}
