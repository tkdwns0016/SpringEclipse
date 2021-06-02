package spring03.aop.ex03.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

//	@Before("execution(public String *.doSomething())")
//	public void beforeSomething() {
//		System.out.println("���� ���� ���� ����.");
//	}
//	
//	@After("execution(String *.doSomething())")
//	public void afterSomething() {
//		System.out.println("���� �ݰ� ���� ���´�");
//	}
//	
//	@AfterReturning(pointcut = "execution(String *.doSomething())",returning = "msg")
//	public void afterReturning(String msg) {
//		System.out.println("return ��!");
//	}
//	
//	@AfterThrowing(pointcut = "execution(String *.doSomething())", throwing = "th")
//	public void afterThrowing(Throwable th) {
//		System.out.println("���ܰ� �߻��߽�!!");
//		for(StackTraceElement e : th.getStackTrace()){
//			System.out.println(e.getClassName());
//		}
//	}
	
	@Around("execution(String *.doSomething())")
	public String around(ProceedingJoinPoint pjp){
		try {
			return (String)pjp.proceed();
		} catch (Throwable e) {
			System.err.println("���ܰ� �߻��߽�!");
			return "���� �߻�";
		}finally {
			System.err.println("���� ���´�.");
		}
	}
}
