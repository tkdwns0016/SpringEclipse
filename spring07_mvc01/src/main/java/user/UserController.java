package user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	// 요청받을 맵핑 url을 여기에 적는다. /hello를 요청받았을때 자동으로 fowarding을 해줌
	@RequestMapping("/hello")
	public String helloView() {

		// return String은 보여줄 화면의 경로를 반환한다.
		return "/WEB-INF/view/hello.jsp";
	}
	
	//path = 맵핑 주소. hello2로 요청받아 method가 get이면 실행.
	@RequestMapping(path = "/hello2",method = RequestMethod.GET)
	public ModelAndView helloMV() {
		ModelAndView mv = new ModelAndView();
		
		//setAttribute와 비슷함! (키,밸류)형식으로 사용함.
		mv.addObject("greeting","hello world");
		mv.addObject("number", 100);
		mv.setViewName("/WEB-INF/view/hello2.jsp");
		return mv;
	}
	
	
	
	
	
}
