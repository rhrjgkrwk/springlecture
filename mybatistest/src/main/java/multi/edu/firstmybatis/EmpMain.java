package multi.edu.firstmybatis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class EmpMain {
	public static void main(String[] args) throws IOException {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("multi/edu/firstmybatis/mybatis-config.xml"));
		SqlSession session = factory.openSession(true);
		
		
		
		//session을 만들어서 service 에 주입
		EmpService service = new EmpServiceImpl();
		EmpDAO dao = new EmpDAO();
		
		dao.setSession(session);
		((EmpServiceImpl)service).setDao(dao);
		/////getAnEmp///////
//		EmpVO vo = service.getAnEmp("bell");
//		System.out.println(vo);
		System.out.println("------------------------------------------");
		
		////////getAllEmp///////
//		ArrayList<EmpVO> list = service.getAllEmp();
//		for (EmpVO empVO : list) {
//			System.out.println(empVO);
//		}
		
		////insertEmp/////
//		EmpVO newVO = new EmpVO(1021, 100, "Parkdd", "SH_CLERK", "dddd@gm.com", " ");
//		service.insertEmp(newVO);
		
		
		/////updateEmp//////
//		EmpVO updateVO = new EmpVO(1024, 200, "Lee", "SH_CLERK", "sajddd1@gmm.c", " ");
//		service.updateEmp(updateVO);
		
		
		//////deleteEmp/////
//		service.deleteEmp(1021); //constraint 땜시 삭제가 안된다. 수정해보자.
		
		
		//////insertEmpSeq/////////
//		EmpVO vo = new EmpVO(0, 200, "홍", "IT_PROG", "sddd1@gmm.c", " ");
//		int res = service.insertEmpSeq(vo);
//		if (res>0) {
//			System.out.println("제대로 반영되었다.");
//		}
		
		///////selectByDeptWithArray////////
	/*	ArrayList<EmpVO> list = dao.selectByDeptWithArray(new int[]{50,80,100});
		for (EmpVO empVO : list) {
			System.out.println(empVO);
		}*/
		
		
		/////selectByDeptWithList////////
//		List<Integer> param = new ArrayList<Integer>();
//		param.add(10);
//		param.add(20);
//		param.add(30);
//		param.add(40);
//		param.add(80);
//		ArrayList<EmpVO> list = dao.selectByDeptWithList(param);
//		for (EmpVO empVO : list) {
//			System.out.println(empVO);
//		}
		
		
		/////updateEmpWithMap////////
		//Map을 parameter로 전달해보자.
		Map<String, String> param = new HashMap<>();
		param.put("map_deptid", "50");
		param.put("map_empid", "101");
		param.put("map_email", "coonyang1@gmail.com");
		service.updateEmpWithMap(param);
		
		session.close();
	}
}
