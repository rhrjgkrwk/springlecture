package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("aop/aop.xml");
		Member m = factory.getBean("target1", Member.class);
		Board b = factory.getBean("target2", Board.class);
		
		m.login("쿠냥");
		m.logout();
		b.getList();
		b.insert(1515);
	}
}
