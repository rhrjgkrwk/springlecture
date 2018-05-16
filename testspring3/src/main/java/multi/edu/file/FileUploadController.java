package multi.edu.file;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class FileUploadController {
	@RequestMapping(value="upload.file", method=RequestMethod.GET)
	public String uploadForm() {
		return "uploadform";
	}
	
	@RequestMapping(value="upload.file", method=RequestMethod.POST)
	public String uploadResult(UploadVO vo) {
		MultipartFile multipartfile1 = vo.getFile1();
		MultipartFile multipartfile2 = vo.getFile2();
		
		String fileName1 = multipartfile1.getOriginalFilename(); //전송받은 파일이름을 그대로 가져온다.
		String fileName2 = multipartfile2.getOriginalFilename();
		String savePath = "c:\\upload";
		try {
			File path = new File(savePath);
			
			
//			해당경로에 있는 모든 파일이름을 가져온다.
			String[] fileList = path.list();
//			
//			중복검사를 해보자.
//			for (String s : fileList) {
//				if (s.equals(fileName1)) {
//					fileName1 = fileName1.split("[.]")[0]+"1."+fileName1.split("[.]")[1];
//				}
//				if (s.equals(fileName2)) {
//					fileName2 = fileName2.split("[.]")[0]+"1."+fileName2.split("[.]")[1];
//				}
//			}
//			File file1 = new File(savePath+"\\"+fileName1);
//			File file2 = new File(savePath+"\\"+fileName2);
			
			
			
//			UUid 암호화를 위해 파일명과 확장자명을 분리해놓자.
			String ext1 = fileName1.substring(fileName1.lastIndexOf("."));
			String ext2 = fileName2.substring(fileName2.lastIndexOf("."));
			String saveFileName1 = getUuid() + ext1;
			String saveFileName2 = getUuid() + ext2;
			
			File file1 = new File(savePath+"\\"+saveFileName1);
			File file2 = new File(savePath+"\\"+saveFileName2);
			
			multipartfile1.transferTo(file1);
			multipartfile2.transferTo(file2);
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "uploadresult";
	}
	
	
	
	//UUID 알고리즘을 통해
	//파일명을 암호화해보자.
	public static String getUuid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	
}
