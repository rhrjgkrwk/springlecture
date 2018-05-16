package tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVMain {
	// coupling�� ���纸��.
	// TV factory������ �ν��Ͻ��� �����Ͽ� main�� �Ѱ��ش�.

	public static void main(String[] args)
			throws Exception {
		ApplicationContext factory = new ClassPathXmlApplicationContext("tv/tv.xml");
		TV tv = (TV)factory.getBean("tv");
		tv.turnOn();
		tv.turnOff();
		tv.volumeDown();
		tv.volumeUp();
		
	}
}
