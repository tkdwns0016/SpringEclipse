package spring03.aop.ex03.annotation;

import org.springframework.stereotype.Component;

@Component
public class Boy {
	public String doSomething() {
		System.out.println("Áý¿¡¼­ »¡·¡¸¦ ÇÑ´Ù."); //ÇÙ½É
		
		return "I am a boy";
	}
}
