package multi.edu.firstmybatis;

public class EmpVO2 {		
	private int emp_id;
	private String name;
	private String phone;
	public EmpVO2() {
		// TODO Auto-generated constructor stub
	}
	public EmpVO2(int emp_id, String name, String phone) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.phone = phone;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}	
