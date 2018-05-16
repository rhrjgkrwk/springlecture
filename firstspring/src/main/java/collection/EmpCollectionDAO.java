package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class EmpCollectionDAO {
	ArrayList<EmpVO> empList;
	HashSet<EmpVO> empSet;
	HashMap<String, EmpVO> empMap;
	

	public HashMap<String, EmpVO> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(HashMap<String, EmpVO> empMap) {
		this.empMap = empMap;
	}

	public HashSet<EmpVO> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(HashSet<EmpVO> empSet) {
		this.empSet = empSet;
	}

	public EmpCollectionDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public EmpCollectionDAO(ArrayList<EmpVO> empList) {
		super();
		this.empList = empList;
	}

	public ArrayList<EmpVO> getEmpList() {
		return empList;
	}

	public void setEmpList(ArrayList<EmpVO> empList) {
		this.empList = empList;
	}
	
}
