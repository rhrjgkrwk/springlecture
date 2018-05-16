package multi.edu.firstmybatis;

import java.util.ArrayList;

public interface EmpService {
	public EmpVO getAnEmp(String last_name);
	public ArrayList<EmpVO> getAllEmp();
	public void insertEmp(EmpVO vo);
	public void updateEmp(EmpVO vo);
	public void deleteEmp(int employee_id);
}
