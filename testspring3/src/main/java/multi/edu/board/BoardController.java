package multi.edu.board;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	@Autowired
	BoardDAO dao;
	
	@RequestMapping(value="/board/list")
	public ModelAndView getList(){
		// web-inf/views/board/list.jsp
		ModelAndView mv = new ModelAndView();
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardVO> boardList = dao.getBoardList();
		mv.addObject("boardList", boardList);
		mv.setViewName("board/list");
		return mv;
	}
	
	
	//글 등록
	@RequestMapping(value="/board/write", method=RequestMethod.GET) //Form에 입장하려는 경우
	public void writeForm(){
		// web-inf/views/board/write.jsp
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.POST) //Form에 작성된 글이 넘어온 경우
	public String writeSuccess(BoardVO vo){
		// web-inf/views/board/write.jsp
		//여기서 파일 업로드 처리하자.
//		C:\board_files
		String savePath = "C:\\board_files\\"; 
		String fileName = vo.getFile().getOriginalFilename();
		vo.setFile_name(fileName);
		File newFile = new File(savePath+fileName);
		System.out.println(vo.getFile().getOriginalFilename());
		try {
			if (newFile.exists()) {
				fileName =  fileName.split("[.]")[0]+"1."+fileName.split("[.]")[1];
				newFile = new File(savePath+fileName);
				vo.setFile_name(fileName);
			}
			vo.getFile().transferTo(newFile);
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//DB에 저장!
		dao.insertBoard(vo);
		
		return "redirect:list"; // 작성이 완료되었으면 다시 리스트를 보여주도록 만들자.
	}
	
	//수정도 구현해보자.
	@RequestMapping(value="/board/edit", method=RequestMethod.GET) //Form에 작성된 글이 넘어온 경우
	public ModelAndView editBoard(String idx){
		ModelAndView mv = new ModelAndView();
		BoardVO vo = new BoardVO();
		vo = dao.getBoard(Integer.parseInt(idx));
		mv.addObject("boardVO", vo);
		mv.setViewName("board/edit");
		return mv;
		// web-inf/views/board/write.jsp
	}
	@RequestMapping(value="/board/edit", method=RequestMethod.POST) //Form에 작성된 글이 넘어온 경우
	public String editSuccess(BoardVO vo){
		System.out.println(vo);
		// web-inf/views/board/write.jsp
		vo.setFile_name(vo.getFile().getOriginalFilename());
		dao.updateBoard(vo);
		return "redirect:list"; // 작성이 완료되었으면 다시 리스트를 보여주도록 만들자.
	}
	
	
	//삭제
	@RequestMapping(value="/board/delete") //Form에 작성된 글이 넘어온 경우
	public String deleteBoard(String idx){
		// web-inf/views/board/write.jsp
		ModelAndView mv = new ModelAndView();
		dao.deleteBoard(Integer.parseInt(idx));
		return "redirect:list"; // 작성이 완료되었으면 다시 리스트를 보여주도록 만들자.
	}
	
	
	//글 확인
	@RequestMapping(value="/board/detail") //Form에 입장하려는 경우
	public ModelAndView getDetail(String idx){
		// web-inf/views/board/detail.jsp
		ModelAndView mv = new ModelAndView();
		
		BoardVO vo = new BoardVO();
		vo = dao.getBoard(Integer.parseInt(idx));
		mv.addObject("boardVO", vo);
		mv.setViewName("board/detail");
		return mv;
	}
	
//	파일 다운로드를 해보자.
	@RequestMapping("board.file")
	public void downloadResult(String filename, HttpServletResponse response){
		File file = new File("c:\\board_files\\"+filename);
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
