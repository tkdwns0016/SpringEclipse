package spring.di.ex02;

import org.springframework.stereotype.Component;

@Component
public class PunchAttack implements Attack{

	@Override
	public void attack() {
		System.out.println("ÆÝÄ¡ ¾îÅÃ");
	}

}
