package multi.edu.file;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

public class UploadVO {
	private String name;
	private String description;
	private String filename;
	private MultipartFile file1;
	private MultipartFile file2;
	public UploadVO() {
		// TODO Auto-generated constructor stub
	}
	public UploadVO(String name, String description, String filename, MultipartFile file1, MultipartFile file2) {
		super();
		this.name = name;
		this.description = description;
		this.filename = filename;
		this.file1 = file1;
		this.file2 = file2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public MultipartFile getFile1() {
		return file1;
	}
	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}
	public MultipartFile getFile2() {
		return file2;
	}
	public void setFile2(MultipartFile file2) {
		this.file2 = file2;
	}
}
