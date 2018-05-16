package speaker;
//POJO 형태의 클래스 
public class MarshalSpeaker implements Speaker{

	public MarshalSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("마샬 스피커 생성!");
	}
	
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("MarshalSpeaker volume up");
	}

	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("MarshalSpeaker volume down");
	}
}
