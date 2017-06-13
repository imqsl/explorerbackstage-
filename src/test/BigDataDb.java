package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Bean.BigData;

public class BigDataDb {
	
private Connection conn=null;
private Statement st=null;
private ResultSet rs=null;
private List<BigData> mlist=null;
public BigDataDb() {
try {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	String url="jdbc:mysql://localhost:3306/bigdata";
	String dbUser="abc";
	String dbPass="123456";
	conn=DriverManager.getConnection(url,dbUser,dbPass);
	st=conn.createStatement();

	System.out.println("数据库已连接");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (InstantiationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}
public boolean checkUser(String username,String pass){
	String sql="select * from user_info where username='"+username+"'and userpwd='"+pass+"'";
	System.out.println(sql);
	try {
		rs=st.executeQuery(sql);
		while(rs.next()){
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	return false;
}
public boolean insertUser(String username,String pass,String realname,String email,String phone){
	String sql="insert into user_info (username,userpwd,realname,email,phone) values(?,?,?,?,?)";
	try {
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1, username);
		pst.setString(2, pass);
		pst.setString(3, realname);
		pst.setString(4, email);
		pst.setString(5, phone);
		pst.executeUpdate();
		return true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	
}
public List<BigData> getBigData(String name){
	String sql="select * from perbigdata where name like '%"+name+"%'";
	try {
		System.out.println(sql);
		rs=st.executeQuery(sql);
		mlist=new ArrayList<BigData>();
		int i=0;
		while(rs.next()) {
			BigData bd=new BigData(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
					rs.getString(6),rs.getString(7),rs.getString(8),
					rs.getString(9),rs.getString(10));
			System.out.println("bd:"+i+bd.toString());
			i++;
			mlist.add(bd);
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return mlist;
	
}


}
