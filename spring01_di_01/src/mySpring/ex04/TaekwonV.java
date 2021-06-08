package mySpring.ex04;



//@스프링에 빈으로 등록하기 위한 어노테이션
public class TaekwonV {
	private Attack attack;
	private String name;
	
	
	
	public TaekwonV(Attack attack, String name) {
		this.attack = attack;
		this.name= name;
	}
	
	public void fight() {
		System.out.println(name+"이");
		attack.attack();
		
	}
}
