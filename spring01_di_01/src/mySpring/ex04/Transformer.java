package mySpring.ex04;

import org.springframework.stereotype.Component;

//@스프링에 빈으로 등록하기 위한 어노테이션
@Component
public class Transformer {//컴포넌트로 하면 id를 transformer로 만들어준다
	private Attack attack;
	private String name;
	
	public Transformer() {}
	
	public Transformer(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
	public void fight() {
		System.out.println(name+"이");
		attack.attack();
	}
	
	
}
