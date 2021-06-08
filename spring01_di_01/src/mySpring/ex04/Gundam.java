package mySpring.ex04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Gundam {
	
	@Value("건담")
	private String name;
	
//	@Autowired
//	@Qualifier("missileAttack")
//	private Attack attack;
	
	
	public void fight(){
		System.out.println(name+"이");
//		attack.attack();
	}
}
