package spring.di.ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Transformer {
	@Value("트랜스포머")
	private String name;
	
	@Autowired
	@Qualifier("missileAttack")
	private Attack attack1;
	private Attack attack2;
	
	public Transformer(@Autowired @Qualifier("punchAttack") Attack attack2){
		this.attack2 = attack2;
	}
	
	
	public void fight() {
		System.out.println("이름 : "+name);
		attack1.attack();
		attack2.attack();
	}
}
