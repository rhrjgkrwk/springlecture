package multi.edu.firstmybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpDAO empDAO;
	
	@Override
	public EmpVO getEmpOne(String lastname) {
		// TODO Auto-generated method stub
		EmpVO vo=empDAO.getEmpOne(lastname);
		return vo;
	}

	@Override
	public List<EmpVO> getEmpAll() {
		// TODO Auto-generated method stub
		//ArrayList<EmpVO> list=new ArrayList<EmpVO>();
		return empDAO.getEmpAll();
	}

	public EmpDAO getEmpDAO() {
		return empDAO;
	}

	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}

	@Override
	public void insertEmp() {
		// TODO Auto-generated method stub
		empDAO.insertEmp();
	}

	@Override
	public void updateEmp(EmpVO vo2) {
		// TODO Auto-generated method stub
		empDAO.updateEmp(vo2);
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		empDAO.deleteEmp(id);
	}

	@Override
	public List<EmpVO2> getEmpVO2() {
		// TODO Auto-generated method stub
		return empDAO.getEmpVO2();
	}

	@Override
	public int insertEmpSeq(EmpVO vo) {
		// TODO Auto-generated method stub
		return empDAO.insertEmpSeq(vo);
	}

	@Override
	public List<EmpVO> getEmpWithArray(int[] param) {
		// TODO Auto-generated method stub
		return empDAO.getEmpWithArray(param);
	}

	@Override
	public List<EmpVO> getEmpWithList(List<Integer> param) {
		// TODO Auto-generated method stub
		return empDAO.getEmpWithList(param);
	}

	@Override
	public void updateEmpWithMap(Map<String, String> m) {
		// TODO Auto-generated method stub
		empDAO.updateEmpWithMap(m);
	}

	@Override
	public List<EmpVO> selectEmpWithMap(Map<String, String> m) {
		// TODO Auto-generated method stub
		return empDAO.selectEmpWithMap(m);
	}

	@Override
	public List<EmpVO> selectEmpRownum(Map<String,Integer> m) {
		// TODO Auto-generated method stub
		return empDAO.selectEmpRownum(m);
	}
	
	@Override
	public Map<String, Object> getPageEmp(int[] param) {
		int count = empDAO.getEmpCnt();
		 List<EmpVO> list = empDAO.getEmpRownum(param);
		 Map<String, Object> map
		 = new HashMap<String, Object>();
		 map.put("count", count);
		 map.put("list", list);
		 return map;
	}

}
