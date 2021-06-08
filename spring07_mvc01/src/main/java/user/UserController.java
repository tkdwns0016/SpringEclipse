package user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	// ��û���� ���� url�� ���⿡ ���´�. /hello�� ��û�޾����� �ڵ����� fowarding�� ����
	@RequestMapping("/hello")
	public String helloView() {

		// return String�� ������ ȭ���� ��θ� ��ȯ�Ѵ�.
		return "/WEB-INF/view/hello.jsp";
	}
	
	//path = ���� �ּ�. hello2�� ��û�޾� method�� get�̸� ����.
	@RequestMapping(path = "/hello2",method = RequestMethod.GET)
	public ModelAndView helloMV() {
		ModelAndView mv = new ModelAndView();
		
		//setAttribute�� �����! (Ű,���)�������� �����.
		mv.addObject("greeting","hello world");
		mv.addObject("number", 100);
		mv.setViewName("/WEB-INF/view/hello2.jsp");
		return mv;
	}
	
	
	
	
	
}
