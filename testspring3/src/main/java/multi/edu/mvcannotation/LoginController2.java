package multi.edu.mvcannotation;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController2 {
	//로그인 하면 세션에 정보를 넣어보자.
	
	
	@RequestMapping(value="/login2", method=RequestMethod.GET)//get 방식으로 요청이 들어왔을 때는 아래 메소드를 수행.
	public String loginform(){
		return "loginform2";
	}
	
	@RequestMapping(value="/login2", method=RequestMethod.POST) //post 방식으로 요청이 들어왔을때는 아래 메소드를 수행한다.
	public ModelAndView loginresult(
			@RequestParam(value="date", required=false, defaultValue="오늘") //date라는 이름의 param을 time에 넣어줘, 꼭 필요한건 아니고, 없는 경우 디폴트로 "오늘"이라는 값을 주렴
			String time
			) throws IOException{
		
		
		
		//VO를 param의 name과 동일하게 설정해주면 자동으로 매핑해준다.
		System.out.println("VO를 이용해서 파라미터를 받아와보자.");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginform2");
		
		return mv;//requestMappuing 을 쓰면 파라미터도 같이 전달되낟.
	}
}
