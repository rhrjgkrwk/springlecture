package multi.edu.mvcannotation;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
@SessionAttributes("searchconditionlist")
public class MemberController {
	@ModelAttribute("searchconditionlist")
	public String[] getSearchList(){
		String list[] = new String[3];
		list[0] = "ID검색";
		list[1] = "이름검색";
		list[2] = "비밀번호검색";
		return list;
	}
	@RequestMapping("/searchmember")
	public ModelAndView searchMember(
			@RequestParam(value="searchcondition", required=false, defaultValue="all")
			String condition, 
			@RequestParam(value="searchword", required=false, defaultValue="all")
			String word){
		ModelAndView mv = new ModelAndView();
		if (condition.equals("ID검색")) {
			condition = "id";
		}else if (condition.equals("이름검색")) {
			condition = "name";
		}else if (condition.equals("비밀번호검색")) {
			condition = "pw";
		}
		word.trim();
		mv.addObject("condition", condition);
		mv.addObject("word", word);
		return mv;
	}

	@RequestMapping("/allmember")
	public void getAllMember(){
		return ;
	}
	
	@ModelAttribute("memberlist")
	public ArrayList<MemberVO> getMemberList(){
		ArrayList<MemberVO> list = new ArrayList<>();
		list.add( new MemberVO("JAVA", "JAVA", "이자바"));
		list.add( new MemberVO("ddd", "ffh", "sdfhdsh"));
		list.add( new MemberVO("ee", "gj", "dfdf"));
		list.add( new MemberVO("ww", "gfdj", "dsfhsd"));
		list.add( new MemberVO("qq", "ssd", "adhfd"));
		list.add( new MemberVO("eed", "ash", "sdfgsa"));
		return list;
	}
}
