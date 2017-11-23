

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Android")
public class Android extends HttpServlet {
	
	private int count = 0;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Android() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String arduino_ip = request.getParameter("IP");
		File uploads = new File(getServletContext().getInitParameter("upload.location"));
		File file = new File(uploads, "somefilename.ext");

		try (InputStream input = part.getInputStream()) {
		    Files.copy(input, file.toPath());
		}*/
		
		System.out.println(request.getSession().toString());
		System.out.println(request.getRequestedSessionId());
		
		count++;
	
		response.getWriter().append(request.getSession().toString()).append(count + "");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
