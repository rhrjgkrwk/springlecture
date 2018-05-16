package speaker;

public class SamsungTV implements TV{
	String name; //삼성: xml파일 정의를 통해 주입해보자.
	Speaker speaker;
	
	public SamsungTV() {
		System.out.println("삼성 TV 기본 생성자 호출");
	}
	//생성자를 통한 주입을 해보자.1
	public SamsungTV(Speaker speaker, String name){
		System.out.println("삼성 TV 매개변수 2 생성자 호출");
		this.speaker = speaker;
		this.name = name;
	}
	
	
	//////////////////GET/SETTER/////////////////
	public void setSpeaker(Speaker speaker){
		this.speaker = speaker;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	/////////////////OVERRIDED METHOD////////////////	
	@Override
	public void volumeUp() { 
		//SonySpeaker s = new SonySpeaker(); //객체를 직접 만드는 것을 지양해야한다. 그래서 매개변수로 받는다. 
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
	//	SonySpeaker s = new SonySpeaker();
		speaker.volumeDown();
	}

	@Override
	public void turnOn() { //
		// TODO Auto-generated method stub
		System.out.println(name+"TV on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(name+"TV off");
	}

}