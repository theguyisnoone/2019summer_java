package jdbc_base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class page {
	public static void list(int start, int count){
        try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           }
     
           try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                   "root", "123"); Statement s = c.createStatement();) {
     
               String sql = "select * from hero limit " +start + "," + count;

               // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
               ResultSet rs = s.executeQuery(sql);
               while (rs.next()) {
                   int id = rs.getInt("id");// ����ʹ���ֶ���
                   String name = rs.getString(2);// Ҳ����ʹ���ֶε�˳��
                   float hp = rs.getFloat("hp");
                   int damage = rs.getInt(4);
                   System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
               }
             
           } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
   }
    
   public static void main(String[] args) {
      list(5,5);
   }
}
