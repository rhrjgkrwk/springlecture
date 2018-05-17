package multi.edu.firstmybatis;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class EmpDAO {
//	@Autowired //
	SqlSession session;
	
	public EmpVO getAnEmp(String last_name){
		EmpVO vo = session.selectOne("emp.selectAnEmp", last_name); 
		return vo;
	}

	public ArrayList<EmpVO> getAllEmp(){
		List<EmpVO> list = session.selectList("emp.selectAllEmp");
		return (ArrayList<EmpVO>)list;
	}
	
	public void insertEmp(EmpVO vo){
		session.insert("emp.insertEmp", vo);
	}
	
	public void updateEmp(EmpVO vo){
		session.update("emp.updateEmp", vo);
	}
	public void updateEmpWithMap(Map<String, String> param){
		session.update("emp.updateEmpWithMap", param);
	}
	
	public void deleteEmp(int employee_id){
		session.delete("emp.deleteEmpHistory", employee_id);
		session.delete("emp.deleteEmp", employee_id);
	}
	//seq를 추가해서 삽입해보자.
	public int insertEmpSeq(EmpVO vo){
		return session.insert("emp.insertEmpSeq");
	}
	
	public ArrayList<EmpVO> selectByDeptWithArray(int[] param){
		ArrayList<EmpVO> list = new ArrayList<>(session.selectList("selectByDeptWithArray", param));
		return list;
	}
	
	public ArrayList<EmpVO> selectByDeptWithList(List<Integer> param){
 		ArrayList<EmpVO> list = new ArrayList<>(session.selectList("selectByDeptWithList", param));
		return list;
	}
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	
}
