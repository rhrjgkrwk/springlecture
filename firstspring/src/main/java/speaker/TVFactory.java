package speaker;

public class TVFactory {
	//�Ʒ� ���α׷��� coupling�� ���纸��.
	public TV getTV(String tvName) throws Exception{
		if (tvName.equalsIgnoreCase("samsung")) {
			return (TV) Class.forName("SamTV").newInstance();
		}
		else if (tvName.equalsIgnoreCase("lg")) {
			return (TV) Class.forName("LGTV").newInstance();
		}
		return null;
	}
}
