package jdbc_base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
	public static void main(String[] args) {
		Connection c=null;
		Statement s=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root", "123");
			s=c.createStatement();
			String name="dashen";
			String password="thisispassword1";
			String sql="select * from user where name='"+name+"'and password='"+password+"'";//???
			ResultSet rs=s.executeQuery(sql);
			if(rs.next()) {
				System.out.println("correct");
			}else {
				System.out.println("error");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 if(s!=null)
				try {
					s.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 if(c!=null)
				try {
					c.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
