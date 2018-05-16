package multi.edu.mvcannotation;

public class LoginVO {
	private String id; //INPUT TAG 의 NAME과 동일해야한다.
	private String pw;
	public LoginVO() {
		// TODO Auto-generated constructor stub
	}
	public LoginVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
