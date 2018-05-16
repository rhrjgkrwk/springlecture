package aop;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class Common {
	long startTime = System.currentTimeMillis();
	public void a(){
		System.out.println("a...... 호출"+new Date(startTime));
//		System.out.println(System.currentTimeMillis());
	}
	
	public void b(){
		long endTime = System.currentTimeMillis();
		System.out.println("b...... 호출 "+(endTime-startTime)+"ms");
//		System.out.println(System.currentTimeMillis());
	}
	//메소드 호출직후 c 메소드에 리턴값을 매개변수로 주면서 실행시켜보자.
	public void c(Object returnValue){
		System.out.println("c-----"+returnValue);
	}
	public void d(ProceedingJoinPoint pjp){
		try {
			System.out.println("d=====:메소드 호출 전.");
			//pointcut의 표현식 설정 조건에 맞는 메소드 실행 문장을 작성해야한다. 
			//- 매개변수로 ProceedingJoinPoint 라는 객체를 사용해야한다.
			//proceedingjoinPoint의 proceed 메소드를 사용하면 실행한다.
			Object returnValue = pjp.proceed(); //실행메소드의 리턴값을 리턴해준다.
			
			System.out.println("d=====:메소드 호출 후.");
			System.out.println("실행대상클래스 : "+pjp.getTarget());
			System.out.println("실행대상메소드 : "+pjp.toLongString());
			System.out.println("실행메소드의매개변수 : "+pjp.getArgs());
			System.out.println("실행결과 : "+returnValue);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
