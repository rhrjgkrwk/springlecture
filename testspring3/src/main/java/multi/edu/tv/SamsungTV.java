package multi.edu.tv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//TV tv1 = new SamsungTV()
//@Component("tv1")
public class SamsungTV implements TV{
	// tv1.setSpeaker(sonySpeaker);
	//�ㅽ뵾而ㅽ��낃컼泥� �덈떎硫� �먮룞 di ioc 二쇱엯
	@Autowired
	Speaker speaker ;
	String name;
/*	public SamsungTV
	(Speaker speaker, String name){
		System.out.println
		("Samsungtv�앹꽦�먰샇異�(留ㅺ컻蹂���2媛�)");
		this.speaker = speaker;
		this.name = name;
	}*/
	public SamsungTV(){
		System.out.println("Samsungtv�앹꽦�먰샇異�");
	}
	public void setSpeaker(Speaker speaker){
		this.speaker = speaker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void powerOn(){
		System.out.println("�쇱꽦tv:�꾩썝耳쒕떎");
	}
	public void powerOff(){
		System.out.println("�쇱꽦tv:�꾩썝�꾨떎");
	}
	public void volumeUp(){
		//SonySpeaker s = new SonySpeaker();
		speaker.volumeUp();
	}
	public void volumeDown(){
		//SonySpeaker s = new SonySpeaker();
		speaker.volumeDown();
	}
}
