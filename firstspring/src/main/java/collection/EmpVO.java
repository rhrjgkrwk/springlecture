package collection;

public class EmpVO {
	private int id;
	private String name;
	private double salary;
	public EmpVO() {
		// TODO Auto-generated constructor stub
	}
	public EmpVO(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"번 사원의 이름은 "+name+"이고 급여는 "+salary+"원 이다.";
	}
}
