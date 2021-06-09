package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import user.User;
import user.UserMapper;
import user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class UserTest {

	@Autowired
	UserMapper userMapper;
	
	@Autowired
	UserService userService;
	
	@Test
	public void test() {
//		assertNotNull(userMapper);
//		System.out.println(userMapper.insertUser(new User(0,"김네임", "151848", LocalDate.parse("2021-02-02"), "01048484848", "하늘", LocalDateTime.parse("2021-06-04T13:17:13"))));
//		List<User> userList = userMapper.selectAll();
//		for(User user : userList) {
//			System.out.println(user.getUserId());
//		}
//		System.out.println(userMapper.deleteUser(6));
//		System.out.println(userMapper.updateUser(new User(4, "김쿠쿠", null, LocalDate.parse("2011-12-01"), null, "서울특별시", LocalDateTime.now())));
//		System.out.println(userMapper.updateUser(new User(3, "알리스타", null, null, null, null, null)));
		List<User> userList = userService.selectAll();
		for(User user : userList) {
			System.out.println(user);
		}
		
		
	}
	
	

}
