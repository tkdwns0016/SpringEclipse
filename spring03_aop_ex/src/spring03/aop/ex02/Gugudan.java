package spring03.aop.ex02;

import org.springframework.stereotype.Component;

@Component
public class Gugudan {
	public String gugudan() {
		try {
			for (int num2 = 1; num2 < 10; num2++) {
				System.out.println("5 X "+num2+" = "+(5*num2));
				int rullet = (int)(Math.random()*4);
				if(rullet ==0) {
					throw new ArithmeticException();
				}
				Thread.sleep(1000);
			}
			return "success";
		} catch (InterruptedException e) {
			return "failure";
		}
	}
}
