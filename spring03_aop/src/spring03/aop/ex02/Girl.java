package spring03.aop.ex02;

//�ٽ� ����� ���� Ŭ����
public class Girl {
	public String doSomething() {
//		System.out.println("���� ���� ���� ����.");//����
		System.out.println("������ Ƽ�� ����"); // �ٽ�
//		System.out.println("���� �ݰ� ���� ���´�.");//����

		// 1/2 Ȯ���� ���ܸ� ����
		int num = (int) (Math.random() * 2);
		if (num == 0) {
			throw new ArithmeticException();
		}
		return "I am a girl";
	}
}
