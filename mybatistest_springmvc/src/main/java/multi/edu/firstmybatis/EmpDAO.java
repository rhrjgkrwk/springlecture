package multi.edu.firstmybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpDAO {
	@Autowired
	SqlSession session;

	public EmpVO getEmpOne(String lastname) {

		EmpVO vo = session.selectOne("multi.selectEmpOne", lastname);

		return vo;

	}

	public List<EmpVO> getEmpAll() {
		// TODO Auto-generated method stub
		List<EmpVO> list = session.selectList("multi.selectEmpAll");

		return list;
	}

	public void insertEmp() {
		EmpVO vo = new EmpVO();
		vo.setEmployee_id(1000);
		vo.setLast_name("�솉湲몃룞");
		vo.setEmail("hong@gmail.com");
		vo.setJob_id("IT_PROG");
		//vo.setHire_date(hire_date); xml�뿉�꽌 sysdate �븿�닔濡� 泥섎━�뻽�쓬
		vo.setDepartment_id(50);
		session.insert("multi.insertEmp", vo);
	}
	
	public void updateEmp(EmpVO vo2){
/*		EmpVO vo2 = new EmpVO();
		vo2.setEmployee_id(1000);	
		vo2.setEmail("hong@multi.com");
		vo2.setDepartment_id(100);*/
		session.update("multi.updateEmp",vo2);
	}
	public void deleteEmp(int id){
		session.delete("multi.deleteHistory",id);
		session.delete("multi.deleteEmp", id);
	}
	
	public List<EmpVO2> getEmpVO2(){
		return session.selectList("multi.getEmpVO2");
	}
	public int insertEmpSeq(EmpVO vo){
		return session.insert("multi.insertEmpWithSeq",vo);
	}
	public List<EmpVO> getEmpWithArray(int[] param){
		return session.selectList("multi.selectEmpWithArray", param);
	}
	public List<EmpVO> getEmpWithList(List<Integer> param){
		return session.selectList("multi.selectEmpWithList", param);
		
	}
	public void updateEmpWithMap(Map<String,String> m){
		session.update("multi.updateEmpWithMap", m);
		
	}
	public List<EmpVO> selectEmpWithMap(Map<String, String> m){
		return session.selectList("multi.selectEmpWithMap",m);
	}
	public List<EmpVO> selectEmpRownum(Map<String,Integer> m){
		return session.selectList("multi.selectEmpRownum",m);
	}
	
	public List<EmpVO> getEmpRownum
	(int[] param){
		return session.selectList
		("multi.selectEmpRownum", param);
	}
	
	public List<EmpVO> getEmpWithMap
	(Map<String, String> map){
		return session.selectList
		("multi.selectEmpWithMap", map);
	}
	
	public List<EmpVO> searchEmp(Map<String, String> m){
		return session.selectList("searchEmp", m);
	}
	
	public int getEmpCnt(){
		return
		session.selectOne("multi.selectEmpCnt");
	}
}
