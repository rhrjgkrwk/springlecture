package multi.edu.mvcannotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello.annotation") //http://127.0.0.1:9090/testspring3 생략
	public String hello() throws Exception {
		return "hello";
	}
	
	@RequestMapping("/hello2.annotation") //http://127.0.0.1:9090/testspring3 생략
	public String hello2() throws Exception {
		return "hello2";
	}
	
	//리턴값이 없는 경우, url의 이름과 똑같은 hello3.jsp를 자동으로 매핑한다.
	@RequestMapping("/hello3") //http://127.0.0.1:9090/testspring3 생략
	public void hello3() throws Exception {
		System.out.println("리턴없이 hello3을 호출해보자.");
	}
	
	
	
	//이런 경우는 Ajax 할때 사용한다. 추후에 배우기로한다.
	/*@RequestMapping("/hello4") //http://127.0.0.1:9090/testspring3 생략
	public BoardVO hello4() throws Exception {
		return new BoardVO();
	}*/
}




