package multi.edu.firstmybatis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmpServiceImpl implements EmpService {
	EmpDAO empDAO;
	
	@Override
	public EmpVO getAnEmp(String last_name) {
		return empDAO.getAnEmp(last_name);
	}
	
	@Override
	public ArrayList<EmpVO> getAllEmp() {
		return empDAO.getAllEmp();
	}
	@Override
	public void insertEmp(EmpVO vo) {
		empDAO.insertEmp(vo);
		// TODO Auto-generated method stub
	}
	@Override
	public void updateEmp(EmpVO vo) {
		empDAO.updateEmp(vo);
		// TODO Auto-generated method stub
	}
	
	@Override
	public void updateEmpWithMap(Map<String, String> param) {
		empDAO.updateEmpWithMap(param);
	}
	
	@Override
	public void deleteEmp(int employee_id) {
		empDAO.deleteEmp(employee_id);
		// TODO Auto-generated method stub
	}
	
	@Override
	public int insertEmpSeq(EmpVO vo) {
		return empDAO.insertEmpSeq(vo);
	}
	
	
	@Override
	public ArrayList<EmpVO> selectByDeptWithArray(int[] param) {
		return empDAO.selectByDeptWithArray(param);
	}
	
	@Override
	public ArrayList<EmpVO> selectByDeptWithList(List<Integer> param) {
		return empDAO.selectByDeptWithList(param);
	}
	
	public void setDao(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}
}
