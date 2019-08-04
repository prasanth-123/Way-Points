package pkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class save
 */
@WebServlet(name = "save")
public class save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    /*public save() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("X");
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("A");
		doPost(request,response);
		//PrintWriter out=response.getWriter();
		//out.print("command:"+request.getParameter("EC"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		File file=new File("/Users/admin/Nf1/File.sh");  
	      file.createNewFile();  
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(request.getParameter("EC"));
	      /*PrintWriter out=response.getWriter();
			out.println("Post-version");
			out.print("command:"+request.getParameter("EC"));*/
		fileWriter.close();
		request.getRequestDispatcher("/index.jsp").forward(request,response);
		//fileWriter.flush();
	}

}
