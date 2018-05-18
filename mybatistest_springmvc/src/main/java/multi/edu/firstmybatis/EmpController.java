package multi.edu.firstmybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	@Autowired
	EmpService service;
	
	@Autowired
	SqlSession session;
	
	@RequestMapping("/allemp")
	public ModelAndView getAllEmp(){
		List<EmpVO> list = 
				service.getEmpAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("emplist", list);
		mv.setViewName("allemp");
		return mv;
	}
	
	@RequestMapping("/pageallemp")
	public ModelAndView getPageAllEmp
	(@RequestParam
	(value="pagenum", defaultValue="1") 
	String pagenum){
		int pagenumInt =
				Integer.parseInt(pagenum);
		int start = (pagenumInt - 1) * 10 + 1;
		int end = pagenumInt * 10;
		int [] param = {start, end};
		Map<String, Object> map
		= service.getPageEmp(param);
		//count , list
		int count = (Integer)map.get("count");
		System.out.println("@############################"+count);
		
		int totalPage = 0;
		if(count / 10 == 0){
			totalPage = count / 10;
		}
		else{
			totalPage = count / 10 + 1;
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("totalPage", totalPage);
		mv.addObject
		("emplist", (List<EmpVO>)map.get("list"));
		mv.setViewName("pageemp");
		return mv;
	}
	
	@RequestMapping("/searchemp")
	public ModelAndView searchEmp(String searchcolumn, String searchword){
		ModelAndView mv = new ModelAndView();
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("column", searchcolumn);
		map.put("word", searchword);
//		검색 조건
//		이름
//		부서코드
//		입사년도
		List<EmpVO> res = session.selectList("searchEmp", map);
		mv.addObject("res", res);
		mv.setViewName("pageemp");
		return mv;
	}
	
	
}
