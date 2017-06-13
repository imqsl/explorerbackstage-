package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.BigData;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class testservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
List<BigData> bigdatalist=null;
	public testservlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = new String(request.getParameter("name").
				getBytes("ISO-8859-1"),
				"UTF-8");//客户端writeBytes,服务器端就getBytes并转码
		System.out.println(name);
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");//加入本步设置客户端就可以得到服务器端发来的正确的中文了
		bigdatalist=new ArrayList<BigData>();
		BigDataDb db=new BigDataDb();
		bigdatalist=db.getBigData(name);
		JSONArray array=new JSONArray();
		for(int i=0;i<bigdatalist.size();i++){
			BigData data=bigdatalist.get(i);
			JSONObject obj=new JSONObject();
			obj.put("name", data.getName());
			obj.put("sex", data.getSex());
			obj.put("email", data.getEmail());
			obj.put("phonenum", data.getPhonenum());
			obj.put("qq", data.getQqnum());
			obj.put("wechat", data.getWechat());
			obj.put("alipay", data.getAlipay());
			obj.put("baidu", data.getBadiu());
			obj.put("jd", data.getJd());
			array.add(obj);
		}
		PrintWriter out=response.getWriter();//打印流,输出流,向客户端输入的意思
		System.out.println(array.toString());
		out.print(array.toString());
		out.flush();//打印流必须刷一下
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
