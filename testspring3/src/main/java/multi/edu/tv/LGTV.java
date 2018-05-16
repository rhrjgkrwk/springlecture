package multi.edu.tv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("tv1")
public class LGTV implements TV{
	@Autowired
	Speaker speaker;
	
	public LGTV(){
		System.out.println("lgtv�앹꽦�먰샇異�");
	}
	public void powerOn(){
		System.out.println("LGtv:�꾩썝耳쒕떎");
	}
	public void powerOff(){
		System.out.println("LGtv:�꾩썝�꾨떎");
	}
	public void volumeUp(){
		System.out.println("LGtv:蹂쇰ⅷ�щ━��");
	}
	public void volumeDown(){
		System.out.println("LGtv:蹂쇰ⅷ�대━��");
	}
}
