package speaker;
//POJO 형태의 클래스 
public class SonySpeaker implements Speaker{

	public SonySpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("소니 스피커 생성!");
	}
	
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SonySpeaker volume up");
	}

	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SonySpeaker volume down");
	}
}
