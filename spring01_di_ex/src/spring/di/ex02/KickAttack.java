package spring.di.ex02;

import org.springframework.stereotype.Component;

@Component
public class KickAttack implements Attack{

	@Override
	public void attack() {
		System.out.println("е╠ ╬Нец");
	}

}
