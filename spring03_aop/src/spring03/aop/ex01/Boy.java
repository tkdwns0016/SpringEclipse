package spring03.aop.ex01;

public class Boy {
	public void doSomething() {
		System.out.println("문을 열고 집에 들어간다.");//공통
		System.out.println("라면을 먹는다"); //핵심
		System.out.println("문을 닫고 집을 나온다.");//공통
	}
}
