package multi.edu.firstmybatis;


import java.util.ArrayList;
import java.util.List;

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
	
	public void deleteEmp(int employee_id){
		session.delete("emp.deleteEmpHistory", employee_id);
		session.delete("emp.deleteEmp", employee_id);
	}
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	
}
