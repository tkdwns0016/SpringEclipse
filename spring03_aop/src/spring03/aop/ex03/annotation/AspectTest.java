package spring03.aop.ex03.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring03/aop/ex03/annotation/springContext.xml")
public class AspectTest {

	@Autowired
	ApplicationContext ctx;
	
	@Test
	public void test01() {
		Boy boy = ctx.getBean(Boy.class);
		Girl girl = ctx.getBean(Girl.class);
		
		boy.doSomething();
		girl.doSomething();
	}
	
	
	
	
}
