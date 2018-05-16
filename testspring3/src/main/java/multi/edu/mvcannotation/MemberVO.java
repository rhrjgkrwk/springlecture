package multi.edu.mvcannotation;

public class MemberVO {
	private String id;
	private String name;
	private String pw;
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	public MemberVO(String id, String name, String pw) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"/"+name+"/"+pw;
	}
}
