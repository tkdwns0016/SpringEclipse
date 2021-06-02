package spring03.aop.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class MyAspect {
	StopWatch sw = new StopWatch();

	public void beforeTime() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(
				"비포어 - " + now.getHour() + " : " + now.getMinute() + " : " + now.getSecond() + " : " + now.getNano());
	}

	public void afterTime() {

		LocalDateTime now = LocalDateTime.now();
		System.out.println(
				"에프터 - " + now.getHour() + " : " + now.getMinute() + " : " + now.getSecond() + " : " + now.getNano());
	}

	public void afterReturn() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(
				"에프터리턴 - " + now.getHour() + " : " + now.getMinute() + " : " + now.getSecond() + " : " + now.getNano());
	}

	public void afterThrowable(Throwable th) {
		try {
			LocalDateTime now = LocalDateTime.now();
			FileWriter hel = new FileWriter("file.txt", true);
			hel.write("예외명 : " + th.toString() + " - 발생시간 : " + now.getHour() + " : " + now.getMinute() + " : "
					+ now.getSecond() + " : " + now.getNano() + "\n");
			hel.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String aroundGugu(ProceedingJoinPoint pjp) {
		LocalDateTime now = LocalDateTime.now();
		try {
			pjp.proceed();
		} catch (Throwable e) {
			LocalDateTime now1 = LocalDateTime.now();
			int a = now1.getSecond() - now.getSecond();
			System.out.println(a + "초");
		}
		return "끝.";
	}

	public void afterThrowable1(Throwable th) {
		try {
			LocalDateTime now = LocalDateTime.now();
			FileWriter hel = new FileWriter("file1.txt", true);
			hel.write("예외명 : " + th.toString() + " - 발생시간 : " + now.getHour() + " : " + now.getMinute() + " : "
					+ now.getSecond() + " : " + now.getNano() + "\n");
			hel.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
