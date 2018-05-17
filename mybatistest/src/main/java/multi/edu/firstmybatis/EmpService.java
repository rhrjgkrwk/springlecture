package multi.edu.firstmybatis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface EmpService {
	public EmpVO getAnEmp(String last_name);
	public ArrayList<EmpVO> getAllEmp();
	public void insertEmp(EmpVO vo);
	public void updateEmp(EmpVO vo);
	public void updateEmpWithMap(Map<String, String> param);
	public void deleteEmp(int employee_id);
	public int insertEmpSeq(EmpVO vo);
	public ArrayList<EmpVO> selectByDeptWithArray(int[] param);
	public ArrayList<EmpVO> selectByDeptWithList(List<Integer> param);
}
