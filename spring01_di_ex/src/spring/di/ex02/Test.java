package spring.di.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring/di/ex02/springContext.xml");

		Gundam gundam = ctx.getBean("gundam", Gundam.class);
		gundam.fight();
		System.out.println("------------------");
		TaekwonV tae = ctx.getBean("taekwonVVS", TaekwonV.class);
		tae.fight();
		System.out.println("------------------");
		Transformer trans = ctx.getBean("transformer",Transformer.class);
		trans.fight();
	}
}
