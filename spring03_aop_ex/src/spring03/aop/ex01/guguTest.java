package spring03.aop.ex01;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring03/aop/ex01/springContext.xml")
public class guguTest {
	@Autowired
	ApplicationContext ctx;

	@Test
	public void test() {
		Gugudan gugudan = ctx.getBean("gugudan",Gugudan.class);
		System.out.println(gugudan.gugudan());
	}
}
