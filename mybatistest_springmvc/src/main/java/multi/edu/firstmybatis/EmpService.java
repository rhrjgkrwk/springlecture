package multi.edu.firstmybatis;

import java.util.List;
import java.util.Map;

public interface EmpService {
	public EmpVO getEmpOne(String lastname);
	public List<EmpVO> getEmpAll();
	public void insertEmp();
	public void updateEmp(EmpVO vo2);
	public void deleteEmp(int id);
	public List<EmpVO2> getEmpVO2();
	public int insertEmpSeq(EmpVO vo);
	public List<EmpVO> getEmpWithArray(int[] param);
	public List<EmpVO> getEmpWithList(List<Integer> param);
	public void updateEmpWithMap(Map<String, String> m);
	public List<EmpVO> selectEmpWithMap(Map<String, String> m);
	public List<EmpVO> selectEmpRownum(Map<String,Integer> m);
	public Map<String, Object> getPageEmp(int[] param);
}
