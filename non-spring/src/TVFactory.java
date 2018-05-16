
public class TVFactory {
	//아래 프로그램의 coupling을 낮춰보자.
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
