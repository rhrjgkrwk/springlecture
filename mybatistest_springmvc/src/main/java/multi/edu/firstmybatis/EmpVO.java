package multi.edu.firstmybatis;

public class EmpVO {
	private int employee_id;
	private int department_id;
	private String last_name;
	private String job_id;
	private String email;
	private String hire_date;
	
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getJob_id() {
		return job_id;
	}
	
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	@Override
	public String toString() {
		return "EmpVO [employee_id=" + employee_id + ", department_id=" + department_id + ", last_name=" + last_name
				+ ", job_id=" + job_id + ", email=" + email + ", hire_date=" + hire_date + "]";
	}

}
