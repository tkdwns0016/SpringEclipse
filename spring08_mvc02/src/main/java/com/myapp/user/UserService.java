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
		return userMapper.selectUsers();
	}
	
	// 삽입 메서드
	public User joinUser(User user) {
		user.setJoinedDate(LocalDateTime.now());
		int affectedRow = userMapper.insertUser(user);
		if(affectedRow == 1) {
			return new User(user.getId(),user.getUserId(),user.getPassword(),user.getBirthDate(),user.getPhone(),user.getAddress(),user.getJoinedDate());
		}else {
			return null;
		}
	}
	
	//유저를 id로 조회하는 메서드
	public User getUserById(int id) {
		return userMapper.selectOneById(id);
	}
	
	//유저 내용을 수정하는 메서드
	public User updateUser(User user) {
		int affectedRow = userMapper.updateUser(user);
		if(affectedRow== 1) {
			return new User(user.getId(),user.getUserId(),user.getPassword(),user.getBirthDate(),user.getPhone(),user.getAddress(),user.getJoinedDate());
		}else {
			return null;
		}
			
	}
	
	
}
