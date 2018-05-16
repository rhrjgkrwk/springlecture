package multi.edu.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileDownloadController {
	
	
	
	@RequestMapping("download.file")
	public ModelAndView downloadForm(String pagenum){
		ModelAndView mv = new ModelAndView();
		File path = new File("c:\\upload");
		String[] fileList = path.list();
		mv.addObject("fileList", fileList);
		mv.addObject("pagenum", pagenum);
		mv.setViewName("downloadform");
		return mv;
	}
	@RequestMapping("downloadresult.file")
	public void downloadResult(String filename, HttpServletResponse response){
		File file = new File("c:\\upload\\"+filename);
		response.setContentType("application/download");
		response.setContentLength((int)file.length());
		response.setHeader("Content-Disposition", "attachment;filename=\""+filename+"\"");
		try {
			OutputStream out = response.getOutputStream();//파일을 내보내자.
			FileInputStream fin = new FileInputStream(file);//파일을 가져오자.
			FileCopyUtils.copy(fin, out); //fin에서 out으로 복사.
			out.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
