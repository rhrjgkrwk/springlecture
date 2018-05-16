package multi.edu.tv;


import org.springframework.stereotype.Component;

@Component
public class AppleSpeaker implements Speaker{
public void volumeUp() {
 System.out.println("AppleSpeaker:蹂쇰ⅷ�щ━��");
}
public void volumeDown() {
	System.out.println("AppleSpeaker:蹂쇰ⅷ�대━��");	
}
}