package multi.edu.mvcannotation;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	//로그인 하면 세션에 정보를 넣어보자.
	
//	@RequestMapping("/loginform")
	
	@RequestMapping(value="/login", method=RequestMethod.GET)//get 방식으로 요청이 들어왔을 때는 아래 메소드를 수행.
	public String loginform(){
		return "loginform";
	}
//	@RequestMapping("/loginresult")
//	
//	@RequestMapping(value="/login", method=RequestMethod.POST) //post 방식으로 요청이 들어왔을때는 아래 메소드를 수행한다.
//	public String loginresult(HttpServletRequest request){
//		HttpSession session = request.getSession();
//		
//		String id = (String)request.getParameter("id");
//		String pw = (String)request.getParameter("pw");
//		
//		if (id!=null && pw!=null && id.equals("hr") && pw.equals("hr")) {
//			session.setAttribute("sessionid", id);
//		}
//		else{
//			session.removeAttribute("sessionid");
//		}
//		
//		return "loginresult";
//	}
	
//	@RequestMapping(value="/login", method=RequestMethod.POST) //post 방식으로 요청이 들어왔을때는 아래 메소드를 수행한다.
//	public ModelAndView loginresult(String id, String pw) throws IOException{
//		/* param name과 매개변수 이름을 맞춰줌으로써 아래 변수를 대체해보자.
//		String id = (String)request.getParameter("id");
//		String pw = (String)request.getParameter("pw");
//		*/
//		ModelAndView mv = new ModelAndView();
//		
//		if (id.equals("hr") && pw.equals("hr")) {
//			System.out.println("id는"+id+"이다.");
//			mv.addObject("result", true);
//		}
//		mv.setViewName("loginresult");
//		
//		return mv;//requestMappuing 을 쓰면 파라미터도 같이 전달되낟.
//	}
//	
	@RequestMapping(value="/login", method=RequestMethod.POST) //post 방식으로 요청이 들어왔을때는 아래 메소드를 수행한다.
	public ModelAndView loginresult(
			@ModelAttribute("myobj") 
			LoginVO vo 
			//view로 자동 전달되며 전달되는 변수명은 스프링 컨테이너 내부에서 자동으로 
			//classname에서 앞글자를 소문자로 변환한 형태로 전달된다. 
			//view 전달시 변수명을 설정할 수 있다. @ModelAttribute 지정을 안해주면 
			//자동으로 클래스명(앞글자 소문자)으로 변환되어 전달된다.
			) throws IOException{
		
		
		
		//VO를 param의 name과 동일하게 설정해주면 자동으로 매핑해준다.
		System.out.println("VO를 이용해서 파라미터를 받아와보자.");
		ModelAndView mv = new ModelAndView();
		if (vo.getId().equals("hr") && vo.getPw().equals("hr")) {
			System.out.println("id는"+vo.getId()+"이다.");
			mv.addObject("result", true);
		}
		else{
			mv.addObject("result", false);
		}
		mv.setViewName("loginresult");
		
		return mv;//requestMappuing 을 쓰면 파라미터도 같이 전달되낟.
	}
}
