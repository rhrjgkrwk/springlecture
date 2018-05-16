package multi.edu.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileUploadInfoServlet
 */
public class FileUploadInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUploadInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//html 문서 쓰기
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		//file을 읽어와보자.
		InputStreamReader isr = new InputStreamReader(request.getInputStream(), "utf-8");
		BufferedReader br = new BufferedReader(isr);
		//br.readLine();//파일을 한 라인씩 읽어온다.
		for (String line = null ; (line = br.readLine())!=null;) {
			out.println(line + "<br>");
		}
//		String line = null;
//		while ((line = br.readLine())!=null) {
//			
//		}
	}

}
