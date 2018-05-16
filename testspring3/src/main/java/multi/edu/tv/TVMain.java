package multi.edu.tv;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVMain {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("/speaker.xml");
		TV tv = factory.getBean("tv1", TV.class);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}