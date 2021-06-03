package spring04.mybatis.ex01;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring04/mybatis/ex01/springContext.xml")
public class userTest {

	@Autowired
	SqlSession sqlSession;
	
	@Test@Ignore
	public void test1() {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:spring04/mybatis/ex01/springContext.xml");
		
		DataSource ds = ctx.getBean(DataSource.class);
		assertNotNull(ds);
		
		SqlSessionFactoryBean ssfb = ctx.getBean(SqlSessionFactoryBean.class);
		assertNotNull(ssfb);
		
		SqlSession ss = ctx.getBean(SqlSession.class);
		assertNotNull(ss);
	}
	
	
	@Test
	public void test2() {
		//전체 조회
//		List<User> userList = sqlSession.selectList("userMapper.selectAll");
//		for (User user : userList) {
//			System.out.println(user);
//		}
		
		//id값을 이용한 조회
//		User user = sqlSession.selectOne("userMapper.selectById",2);
//		System.out.println(user);
		
		//삽입
//		User user = new User(0, "저스틴뜨또", "10101110", LocalDate.parse("1854-08-25"), "01011001011", "서울특별시 종로구", LocalDateTime.parse("2021-03-12T13:15"));
//		int result = sqlSession.insert("userMapper.insertUser",user);
//		System.out.println("삽입한 row : "+result);
		
		//수정
//		User user = new User(3, "Mr.더조은씨", "12121122", LocalDate.parse("1854-08-25"), "01022222222", "서울특별시 종로구", LocalDateTime.parse("2021-03-12T13:15"));
//		int result = sqlSession.update("userMapper.updateUser",user);
//		System.out.println("수정된 row : "+result);
		
		//삭제
//		int result = sqlSession.delete("deleteUser",2);
//		System.out.println("삭제된 row : " + result);

		//userId 일부 검색으로 조회.
//		User u= new User();
//		u.setUserId("더");
//		List<User> userList = sqlSession.selectList("userMapper.selectByPiece",u);
//		for(User user : userList) {
//			System.out.println(user);
//		}
		
		
	}

}
