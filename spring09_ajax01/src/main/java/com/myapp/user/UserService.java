package com.myapp.user;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	
	public List<User> getUserList(){
		
		return userMapper.selectList();
	}
	
	public boolean addUser(User user) {
		//가입일을 만들어 추가해준다.
		user.setJoinedDate(LocalDateTime.now());
		
		int rows = userMapper.insertUser(user);
		if(rows >0) {
			return true;
		}else {
			return false;
		}
	}
	
}
