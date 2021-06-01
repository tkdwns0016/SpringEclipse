package spring03.aop.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class MyAspect {
	public void beforeTime() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("������ - "+now.getHour()+" : "+now.getMinute()+" : "+now.getSecond()+" : "+now.getNano());
	}
	
	public void afterTime() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("������ - "+now.getHour()+" : "+now.getMinute()+" : "+now.getSecond()+" : "+now.getNano());
	}
	
	public void afterReturn() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("�����͸��� - "+now.getHour()+" : "+now.getMinute()+" : "+now.getSecond()+" : "+now.getNano());
	}
	
	public void afterThrowable(Throwable th) {
		try {
			LocalDateTime now = LocalDateTime.now(); 
			FileWriter hel = new FileWriter("file.txt",true);
			hel.write("���ܸ� : "+th.toString()+" - �߻��ð� : "+now.getHour()+" : "+now.getMinute()+" : "+now.getSecond()+" : "+now.getNano()+"\n");
			hel.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
