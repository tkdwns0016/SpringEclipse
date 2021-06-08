package spring03.aop.ex01;

//�ٽ� ����� ���� Ŭ����
public class Girl {
	public void doSomething() {
		System.out.println("문을 열고 집에 들어간다.");//공통
		System.out.println("집에서 빨래를 한다."); //핵심
		System.out.println("문을 닫고 집을 나온다.");//공통
	}
}
