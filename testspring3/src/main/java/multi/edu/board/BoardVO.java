package multi.edu.board;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
	private String idx;
	private String title;
	private String content;
	private String name;
	private String file_name;
	private MultipartFile file;
	
	public BoardVO(String idx, String title, String content, String name, String file_name, MultipartFile file) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.name = name;
		this.setFile_name(file_name);
		this.file = file;
	}
	public BoardVO(String idx, String title, String content, String name, String file_name) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.name = name;
		this.setFile_name(file_name);
	}
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}
	public BoardVO(String idx, String title, String content, String name) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.name = name;
	}
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return idx+"/"+title+"/"+content+"/"+name;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	
}
