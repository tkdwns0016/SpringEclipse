package MySpring.test01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import MySpring.test02.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:mySpring/test02/springContext.xml")
public class MyTest01 {
	// 단위 테스트 도구!
	// 단위별 기능을 테스트하기 위한 클래스
	// dao의 select()를 만들었다면 이아이만 테스트하기 위해 사용.

	@Autowired
	User user;

	// 메서드에 Test어노테이션을 붙여서 실행한다.
	@Test
	public void test() {
		assertNotNull(user); // null인지?
		assertEquals(200000,user.getPhone().getPrice()); // 같은지 비교
		assertNotEquals(20000, user.getPhone().getPrice()); // 다른지 비교
		
	}
	
	@After
	public void testAfter() {
		System.out.println(user.getPhone().getBrand());
	}

	/*
	 * junit 의 어노테이션
	 * 
	 * @Test : 테스트 하고자 하는 메서드에 선언
	 * 
	 * @Before : @Test 어노테이션이 실행되기 전에 실행되는 메서드
	 * 
	 * @After : @Test 어노테이션이 먼저 실행되고 다음 실행되는 메서드
	 * 
	 * @BeforeClass : 딱 한번 모든 테스트 전에 실행되는 아이
	 * 
	 * @AfterClass : 모든 테스트가 실행되고 나서 딱 한번 실행되는 아이
	 * 
	 * 
	 * spring-test
	 * 
	 * @RunWith(SpringJUnit4ClassRunner.class)
	 * 
	 * @ContextConfiguration(location="스프링 설정 파일")
	 */
}
