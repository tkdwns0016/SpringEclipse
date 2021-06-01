package spring03.aop.ex01;

//핵심 기능을 갖은 클래스
public class Girl {
	public void doSomething() {
		System.out.println("문을 세게 열고 집에 들어간다.");//공통
		System.out.println("집에서 티비를 본다"); //핵심
		System.out.println("문을 닫고 집을 나온다.");//공통
	}
}
