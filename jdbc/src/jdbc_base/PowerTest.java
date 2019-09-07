package jdbc_base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PowerTest {
	public static void stateInsert(int count) {
		
		try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "123");
	            // 根据sql语句创建PreparedStatement
	            Statement s = c.createStatement();
	        ) {
			for(int i=0;i<count;i++) {
			String sql="insert into hero values(null,"+"'teemo'"+","+i+","+i+")";
	            // 设置参数
			s.execute(sql);
			}
	  
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    
	    }
	
	
public static void PrestateInsert(int count) {
	 String sql = "insert into hero values(null,?,?,?)";
	 try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "123");
	            // 根据sql语句创建PreparedStatement
	            PreparedStatement ps = c.prepareStatement(sql);
	        ) {
	             for(int i=0;i<count;i++) {
	            // 设置参数
	            ps.setString(1, "提莫");
	            ps.setFloat(2, 313.0f);
	            ps.setInt(3, 50);
	            // 执行
	            ps.execute();
	             }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    
	    }
	
	public static void main(String[] args) {
		try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
	   int count=10000;
	   long start1=System.currentTimeMillis();
	   stateInsert(count);
	   long end1=System.currentTimeMillis();
	   System.out.printf( "%s %d %n","statement",end1-start1);
	   
	   long start2=System.currentTimeMillis();
	   PrestateInsert(count);
	   long end2=System.currentTimeMillis();
	   System.out.printf( "%s %d %n","Prestatement",end2-start2);
	}
}
