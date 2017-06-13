package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CheckUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String data=null;
  
    public CheckUser() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=new String(request.getParameter
				("username").getBytes("ISO-8859-1"),"UTF-8");
		String password=new String(request.getParameter
				("password").getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(username);
		System.out.println(password);
		BigDataDb db=new BigDataDb();
		PrintWriter out=response.getWriter();
		boolean result=db.checkUser(username, password);
		System.out.println("result:"+result);
		if(result){
			data="succeed";
		}else{
			data="failed";
		}
		
		out.print(data);
		out.flush();
		out.close();
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
