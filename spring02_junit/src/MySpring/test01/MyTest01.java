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
	// ���� �׽�Ʈ ����!
	// ������ ����� �׽�Ʈ�ϱ� ���� Ŭ����
	// dao�� select()�� ������ٸ� �̾��̸� �׽�Ʈ�ϱ� ���� ���.

	@Autowired
	User user;

	// �޼��忡 Test������̼��� �ٿ��� �����Ѵ�.
	@Test
	public void test() {
		assertNotNull(user); // null����?
		assertEquals(200000,user.getPhone().getPrice()); // ������ ��
		assertNotEquals(20000, user.getPhone().getPrice()); // �ٸ��� ��
		
	}
	
	@After
	public void testAfter() {
		System.out.println(user.getPhone().getBrand());
	}

	/*
	 * junit �� ������̼�
	 * 
	 * @Test : �׽�Ʈ �ϰ��� �ϴ� �޼��忡 ����
	 * 
	 * @Before : @Test ������̼��� ����Ǳ� ���� ����Ǵ� �޼���
	 * 
	 * @After : @Test ������̼��� ���� ����ǰ� ���� ����Ǵ� �޼���
	 * 
	 * @BeforeClass : �� �ѹ� ��� �׽�Ʈ ���� ����Ǵ� ����
	 * 
	 * @AfterClass : ��� �׽�Ʈ�� ����ǰ� ���� �� �ѹ� ����Ǵ� ����
	 * 
	 * 
	 * spring-test
	 * 
	 * @RunWith(SpringJUnit4ClassRunner.class)
	 * 
	 * @ContextConfiguration(location="������ ���� ����")
	 */
}
