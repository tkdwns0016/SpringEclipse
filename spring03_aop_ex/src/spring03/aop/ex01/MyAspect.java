package spring03.aop.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class MyAspect {
	public void beforeTime() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("비포어 - "+now.getHour()+" : "+now.getMinute()+" : "+now.getSecond()+" : "+now.getNano());
	}
	
	public void afterTime() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("에프터 - "+now.getHour()+" : "+now.getMinute()+" : "+now.getSecond()+" : "+now.getNano());
	}
	
	public void afterReturn() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("에프터리턴 - "+now.getHour()+" : "+now.getMinute()+" : "+now.getSecond()+" : "+now.getNano());
	}
	
	public void afterThrowable(Throwable th) {
		try {
			LocalDateTime now = LocalDateTime.now(); 
			FileWriter hel = new FileWriter("file.txt",true);
			hel.write("예외명 : "+th.toString()+" - 발생시간 : "+now.getHour()+" : "+now.getMinute()+" : "+now.getSecond()+" : "+now.getNano()+"\n");
			hel.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
