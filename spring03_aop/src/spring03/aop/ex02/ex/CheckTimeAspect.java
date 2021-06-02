package spring03.aop.ex02.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.ProceedingJoinPoint;

public class CheckTimeAspect {
	public String timeCheck(ProceedingJoinPoint pjp) {
		long startTime = System.currentTimeMillis();

		String result = null;

		try {
			result = (String) pjp.proceed();
		} catch (Throwable e) {
			File file = new File("src/spring03/aop/ex02/ex", "errorLog");
			try(BufferedWriter bw = 
					new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream(file, true), "utf-8"))){
				String msg = e.toString()+"-"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS"))+"\n";
				bw.write(msg);
			} catch (UnsupportedEncodingException e1) {
				e1.printStackTrace();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		long endTime = System.currentTimeMillis();

		long time = endTime - startTime;
		System.out.println(time / 1000 + "√ ");

	}
		return result;
}
}