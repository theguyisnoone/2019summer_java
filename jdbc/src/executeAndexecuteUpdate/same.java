package executeAndexecuteUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class same {
	public static void main(String[] args) {
		 try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	 
	        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "123");
	            Statement s = c.createStatement();) {
	 
	            String sqlInsert = "insert into Hero values (null,'����',616,100)";
	            String sqlDelete = "delete from Hero where id = 100";
	            String sqlUpdate = "update Hero set hp = 300 where id = 100";
	 
	            // ��ͬ�㣺������ִ�����ӣ�ɾ�����޸�
	 
	            s.execute(sqlInsert);
	            s.execute(sqlDelete);
	            s.execute(sqlUpdate);
	            s.executeUpdate(sqlInsert);
	            s.executeUpdate(sqlDelete);
	            s.executeUpdate(sqlUpdate);
	 
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}
}
