package multi.edu.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	ProductService service;
	
	@RequestMapping("/product")
	public ModelAndView sell() {
		System.out.println("컨트롤러 진입!");
		ProductVO vo = service.sell(0.3, 5);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", vo);
		mv.setViewName("product");
		return mv;
	}

}
