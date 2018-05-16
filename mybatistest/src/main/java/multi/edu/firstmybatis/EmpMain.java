package multi.edu.firstmybatis;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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
		EmpVO vo = service.getAnEmp("bell");
		System.out.println(vo);
		System.out.println("------------------------------------------");
		
		
		////////getAllEmp///////
		ArrayList<EmpVO> list = service.getAllEmp();
		for (EmpVO empVO : list) {
			System.out.println(empVO);
		}
		
		
		
		////insertEmp/////
//		EmpVO newVO = new EmpVO(1021, 100, "Parkdd", "SH_CLERK", "dddd@gm.com", " ");
//		service.insertEmp(newVO);
		
		
		/////updateEmp//////
//		EmpVO updateVO = new EmpVO(1024, 200, "Lee", "SH_CLERK", "sajddd1@gmm.c", " ");
//		service.updateEmp(updateVO);
		
		
		//////deleteEmp/////
		service.deleteEmp(1021); //constraint 땜시 삭제가 안된다. 수정해보자.
		
		session.close();
	}
}
