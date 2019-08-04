package pkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class submit
 */
@WebServlet(name = "submit")
public class submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   /* public submit() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("X");
		// TODO Auto-generated method stub
		//doGet(request, response);
		Runtime runtime = Runtime.getRuntime();
		String cmds = (String) "cmd /C powershell C:/Users/admin/Nf1/File.sh";
		//File file = new File("/Users/admin/Nf1/File.sh"); 
		Process proc = runtime.exec(cmds);
		proc.getOutputStream().close();

        InputStream inputstream = proc.getInputStream();

            InputStreamReader inputstreamreader = new InputStreamReader(inputstream);

            BufferedReader bufferedreader = new BufferedReader(inputstreamreader);

        String line;

        while ((line = bufferedreader.readLine()) != null) {

            System.out.println(line);          

      }
		  
		  /*BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); */
		  } 
	}


