package spring.di.ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("taekwonVVS")
public class TaekwonV {
	private String name;
	private Attack attack1;
	private Attack attack2;
	
	public TaekwonV(@Value("태권브이") String name,@Autowired @Qualifier("kickAttack") Attack attack1,@Autowired @Qualifier("punchAttack") Attack attack2) {
		this.name = name;
		this.attack1 = attack1;
		this.attack2 = attack2;
	}
	
	
	public void fight() {
		System.out.println("이름 : "+name);
		attack1.attack();
		attack2.attack();
	}
	
}
