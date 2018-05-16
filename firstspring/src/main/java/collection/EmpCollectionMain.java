package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpCollectionMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("collection/collection.xml");
//		EmpCollectionDAO dao = new EmpCollectionDAO();
//		System.out.println(dao.getEmpList().get(0));
//		위와 같은 작업을 Spring container에서 제공하는 DI 기능을 활용해서 해보자.
		
//		Collection data를 DI 해보자.
		
		
		EmpCollectionDAO dao = factory.getBean("dao", EmpCollectionDAO.class);
		for (EmpVO vo : dao.getEmpList()) {
			System.out.println(vo);
		}
		
		for (EmpVO vo : dao.getEmpSet()) {
			System.out.println(vo);
		}
		
		for (String key : dao.getEmpMap().keySet()) {
			System.out.println(key+" : "+dao.getEmpMap().get(key));
		}
	}
}
