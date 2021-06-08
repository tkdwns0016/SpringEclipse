package gugu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuguController {

	@RequestMapping(path = "/show/gugu01",method = RequestMethod.GET)	
	public ModelAndView gugu01() {
		
		ModelAndView mv = new ModelAndView();
		
		int number = (int)(Math.random()*8)+2;
		System.out.println(number);
		mv.addObject("random",number);
		mv.setViewName("/WEB-INF/view/gugudan01.jsp");
		
		return mv;
	}
	
	@RequestMapping(path = "/show/food", method = RequestMethod.GET)
	public ModelAndView foodList() {
		ModelAndView mv = new ModelAndView();
		List<String> foodList = new ArrayList<String>();
		foodList.add("신라면");
		foodList.add("진라면");
		foodList.add("매운라면");
		System.out.println(foodList);
		mv.addObject("foodlist", foodList);
		mv.setViewName("/WEB-INF/view/foodlist.jsp");
		return mv;
	}
	
}
