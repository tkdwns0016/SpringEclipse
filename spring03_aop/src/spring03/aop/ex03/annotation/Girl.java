package spring03.aop.ex03.annotation;

import org.springframework.stereotype.Component;

//�ٽ� ����� ���� Ŭ����
@Component
public class Girl {
	public String doSomething() {
		System.out.println("������ Ƽ�� ����"); // �ٽ�

		int num = (int) (Math.random() * 2);
		if (num == 0) {
			throw new ArithmeticException();
		}
		return "I am a girl";
	}
}
