
public class TVMain {
	// coupling�� ���纸��.
	// TV factory������ �ν��Ͻ��� �����Ͽ� main�� �Ѱ��ش�.

	public static void main(String[] args)
			throws Exception {
		// new SamTV().turnOn();
		// new SamTV().volumeUp();
		// new SamTV().volumeDown();
		// new SamTV().turnOff();

		// ����� �Ű������� �Է¹޾Ƽ� �ν��Ͻ��� �����غ���.
		// 1. �Է��� lg or samsung���� �޴´�.
		// 2. class.forName() method�� Ȱ������.
		// 3. Class.forName("String").newInstance() - �̷��� "String" ��ü�� ���ο� �ν��Ͻ���
		// �������ش�.


		
		TV lg = (TV) Class.forName("LGTV").newInstance();
		// TV lg = new LGTV();
		// �������̽��� �⺻������ ��ü�� ������ �� ������ �̸� ������ Ŭ������ ������ �����ϴ�.
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
		
		
//		tvfactory�� getTv �޼��带 Ȱ���ؼ� �ν��Ͻ��� �����غ���.
		TV tf = new TVFactory().getTV("Samsung");
		tf.turnOn();
		
	}

}
