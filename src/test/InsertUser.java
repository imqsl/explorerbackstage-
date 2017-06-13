package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InsertUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String data=null;
    
    public InsertUser() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=new String(request.getParameter
				("username").getBytes("ISO-8859-1"),"UTF-8");
		String password=new String(request.getParameter
				("password").getBytes("ISO-8859-1"),"UTF-8");
		String realname=new String(request.getParameter
				("realname").getBytes("ISO-8859-1"),"UTF-8");
		String phone=new String(request.getParameter
				("phone").getBytes("ISO-8859-1"),"UTF-8");
		String email=new String(request.getParameter
				("email").getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(username);
		System.out.println(password);
		System.out.println(realname);
		System.out.println(phone);
		System.out.println(email);
		BigDataDb db=new BigDataDb();
		boolean result=db.insertUser(username, password, realname, email, phone);
		if(result){
			data="succeed";
		}else{
			data="failed";
		}
		PrintWriter out=response.getWriter();
		out.print(data);
		out.flush();
		out.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
