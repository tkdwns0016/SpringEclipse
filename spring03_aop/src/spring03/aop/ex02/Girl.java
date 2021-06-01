package spring03.aop.ex02;

//핵심 기능을 갖은 클래스
public class Girl {
	public String doSomething() {
//		System.out.println("문을 세게 집에 들어간다.");//공통
		System.out.println("집에서 티비를 본다"); // 핵심
//		System.out.println("문을 닫고 집을 나온다.");//공통

		// 1/2 확률로 예외를 만들어봄
		int num = (int) (Math.random() * 2);
		if (num == 0) {
			throw new ArithmeticException();
		}
		return "I am a girl";
	}
}
