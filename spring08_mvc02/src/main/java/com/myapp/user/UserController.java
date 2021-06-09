package com.myapp.user;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/list")
	public String showUserList(Model model) {
		//서비스를 이용하여 데이타를 가져옴
		List<User> userList = userService.getUserList();
		//모델을 이용하여 데이터를 담음
		model.addAttribute("userList",userList);
		
		//결과 데이터를 보냄
		return "userListView";
	}
	@GetMapping("/input")
	public String showUserInputForm() {
		//user/input요청이 왔을 때
		return "userInputForm";
	}
	
	@PostMapping("/input")
	public String inputUser(Model model,User user) {
		//데이터가 잘 넘어왔는지 확인.
//		System.out.println(user);
		
		//넘어온 데이터를 service를 이용하여 DB에 넣는다
		User resultUser = userService.joinUser(user);
		
		//결과 화면으로 추가된 데이타를 보여주자
		model.addAttribute("resultUser", resultUser);
		
		return "result";
	}
	
	
}
