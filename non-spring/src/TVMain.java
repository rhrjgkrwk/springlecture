
public class TVMain {
	// coupling을 낮춰보자.
	// TV factory에서는 인스턴스를 생성하여 main에 넘겨준다.

	public static void main(String[] args)
			throws Exception {
		// new SamTV().turnOn();
		// new SamTV().volumeUp();
		// new SamTV().volumeDown();
		// new SamTV().turnOff();

		// 명령행 매개변수로 입력받아서 인스턴스를 생성해보자.
		// 1. 입력을 lg or samsung으로 받는다.
		// 2. class.forName() method를 활용하자.
		// 3. Class.forName("String").newInstance() - 이러면 "String" 객체의 새로운 인스턴스를
		// 생성해준다.


		
		TV lg = (TV) Class.forName("LGTV").newInstance();
		// TV lg = new LGTV();
		// 인터페이스는 기본적으로 객체를 생성할 수 없지만 이를 구현한 클래스로 생성이 가능하다.
		lg.turnOn();
		lg.volumeUp();
		lg.volumeDown();
		lg.turnOff();

		TV sam = (TV) Class.forName("SamTV").newInstance();
		// TV sam = new SamTV();
		sam.turnOn();
		sam.volumeUp();
		sam.volumeDown();
		sam.turnOff();
		
		
//		tvfactory의 getTv 메서드를 활용해서 인스턴스를 생성해보자.
		TV tf = new TVFactory().getTV("Samsung");
		tf.turnOn();
		
	}

}
