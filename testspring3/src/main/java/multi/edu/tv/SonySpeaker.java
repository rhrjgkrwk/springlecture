package multi.edu.tv;

import org.springframework.stereotype.Component;
//Speaker sonySpeaker = new SonySpeaker()

public class SonySpeaker implements Speaker {
public void volumeUp(){
	System.out.println("SonySpeaker:蹂쇰ⅷ�щ━��");
}
public void volumeDown(){
	System.out.println("SonySpeaker:蹂쇰ⅷ�대━��");
}
}