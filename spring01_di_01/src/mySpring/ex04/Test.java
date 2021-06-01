package mySpring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("mySpring/ex04/springContext.xml");
		
		
		Gundam gundam = ctx.getBean("gundam",Gundam.class);
		gundam.fight();
		
	}
}
