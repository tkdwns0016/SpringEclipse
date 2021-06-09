package spring08_mvc02;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myapp.user.User;
import com.myapp.user.UserController;
import com.myapp.user.UserMapper;
import com.myapp.user.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root_context.xml")
public class JdbcTest {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	UserService userService;
	
//	@Autowired
//	UserController uc;
	
//	@Ignore
	@Test
	public void getUserListTest() {
		List<User> userList = userService.getUserList();
		for(User user:userList) {
			System.out.println(user);
		}
	}
	
//	@Ignore
	@Test
	public void test() {
		assertNotNull(dataSource);
		assertNotNull(userMapper);
		assertNotNull(userService);
//		assertNotNull(uc);
		
//		List<User> userList = userMapper.selectUsers();
//		for(User user : userList) {
//			System.out.println(user);
		}
		
		
		
		
	}
