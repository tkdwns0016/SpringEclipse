package spring.di.ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Gundam {
	@Value("건담")
	private String name;
	
	@Autowired
	@Qualifier("kickAttack")
	private Attack attack1;
	
	@Autowired
	@Qualifier("missileAttack")
	private Attack attack2;
	
	public void fight() {
		System.out.println("이름 : "+name);
		attack1.attack();
		attack2.attack();
	}
}
