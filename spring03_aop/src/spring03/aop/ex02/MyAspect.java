package spring03.aop.ex02;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public void beforeDoSomething() {
		System.out.println("���� ���� ���� ���� ����.");
	}

	public void afterDoSomething() {
		System.out.println("���� �ݰ� ���� ���´�.");
	}

	public String afterReturn(String msg) {
		return "������ ���� : " + msg;
	}

	public String afterThrowing(Throwable th) {
		System.out.println("���� ������!!");
		return "���� �߻�";
	}

	// �ٽɱ���� ���μ� ������.
	public String myAround(ProceedingJoinPoint jp) {
		//�ٽɱ���� �����Ϸ��� �޼���
		try {
			System.out.println("����");
			String result = (String)jp.proceed();
			System.out.println("������");
			System.out.println("joinPoint proceed() ��� : "+result); //������ ����
			
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("������ ���ο�");
		}
		return "test";
	}
}
