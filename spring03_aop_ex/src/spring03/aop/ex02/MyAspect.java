package spring03.aop.ex02;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Before("execution(String *.gugudan())")
	public void before1() {
		System.out.println("시작 전에 시작하는 것");
	}
	
	@After("execution(public String Gugudan.gugudan())")
	public void after1() {
		System.out.println("종료 후에 시작하는 것");
	}
	
	@AfterReturning(pointcut = "execution(String *.gugudan())",returning = "msg")
	public void testReturning(String msg) {
		System.out.println("이걸 끝낼 수 있다고?");
	}
	
	
	@AfterThrowing(pointcut = "execution(public String *.gugudan())",throwing =  "th")
	public void afterThrowing1(Throwable th) {
		System.out.println(th.toString());
	}
	
}
