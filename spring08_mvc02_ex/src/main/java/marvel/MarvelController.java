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
	
	@Autowired
	MarvelMapper marvelMapper;
	
	@GetMapping("/list")
	public String marvelList(Model m,String page) {
		if(page==null) {
			page="1";
		}
		int pageNum = Integer.parseInt(page);
		int ttl = marvelMapper.selectCount();
		//ceil에 (ttl/3)을 할 시 6이 나옴. int/int이기 때문인것으로 판단 됨.
		int showByPage = (int)Math.ceil(ttl/3.0);	
		List<Marvel> marvelList = marvelService.selectList(pageNum);
		m.addAttribute("marvelList",marvelList);
		m.addAttribute("showByPage", showByPage);
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
	
	@GetMapping("/movieList")
	public String moveToMovieList(Model m,String page) {
		if(page==null) {
			page="1";
		}
		int pageNum = Integer.parseInt(page);
		int ttl = marvelMapper.selectMovieCount();
		int showByPage = (int)Math.ceil(ttl/5.0);	
		List<Movie> marvelList = marvelService.selectMovieList(pageNum);
		m.addAttribute("movieList",marvelList);
		m.addAttribute("showByPage", showByPage);
		return "movieList";
	}
	
	@GetMapping("/showMoreThan")
	public String showMoreThan(Model m ,int id) {
		Movie movie = marvelMapper.selectMovie(id);
		
		m.addAttribute("movie", movie);
		
		return "showMoreThan";
	}
	
	
	
	
	
	
}
