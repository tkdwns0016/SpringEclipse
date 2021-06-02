package spring03.aop.ex02.ex;

import java.util.Random;

public class Gugu {
	public String printGugu() throws Exception {
		Random random = new Random();
		
		for( int i = 1; i<=9; i++) {
			int num =random.nextInt(3);
			if(num==0) {
				throw new Exception();
			}
			
			System.out.printf("5 * %d = %d \n",i, i*5);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return "success";
	}
}
