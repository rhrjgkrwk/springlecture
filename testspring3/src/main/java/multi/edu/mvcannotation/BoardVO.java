package multi.edu.mvcannotation;

public class BoardVO {
	private String name;
	private String title;
	private String content;
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}
	public BoardVO(String name, String title, String content) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
