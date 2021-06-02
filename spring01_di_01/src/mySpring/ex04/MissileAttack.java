package mySpring.ex04;

import org.springframework.stereotype.Component;

@Component //빈으로 등록하기.
public class MissileAttack implements Attack{

	@Override
	public void attack() {
		System.out.println("미사일");
	}
	
}
