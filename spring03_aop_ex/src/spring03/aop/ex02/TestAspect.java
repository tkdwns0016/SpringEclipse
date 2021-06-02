package spring03.aop.ex02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring03/aop/ex02/springContext.xml")
public class TestAspect {

	@Autowired
	ApplicationContext ctx; 
	
	@Test
	public void test() {
		Gugudan gugu = ctx.getBean(Gugudan.class);
		gugu.gugudan();
	}
}
