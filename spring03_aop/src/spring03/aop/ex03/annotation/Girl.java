package spring03.aop.ex03.annotation;

import org.springframework.stereotype.Component;

//핵심 기능을 갖은 클래스
@Component
public class Girl {
	public String doSomething() {
		System.out.println("집에서 티비를 본다"); // 핵심

		int num = (int) (Math.random() * 2);
		if (num == 0) {
			throw new ArithmeticException();
		}
		return "I am a girl";
	}
}
