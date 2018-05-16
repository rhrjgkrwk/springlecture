package speaker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVMain {
	// coupling�� ��
	// TV factory������ �ν��Ͻ��� �����Ͽ� main�� �Ѱ��ش�.

	public static
	void main(String[] args)
	
			throws Exception {
		
		@SuppressWarnings("resource")
		ApplicationContext factory = new ClassPathXmlApplicationContext("speaker/speaker.xml");
		TV tv = factory.getBean("tv1", TV.class);
		SamsungTV tv1 = factory.getBean("tv1", SamsungTV.class);
		System.out.println(tv1.getName());
		tv.turnOn();
		tv.turnOff();
		tv.volumeDown();
		tv.volumeUp();
		
	}
}
