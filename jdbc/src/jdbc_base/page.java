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

               // 执行查询语句，并把结果集返回给ResultSet
               ResultSet rs = s.executeQuery(sql);
               while (rs.next()) {
                   int id = rs.getInt("id");// 可以使用字段名
                   String name = rs.getString(2);// 也可以使用字段的顺序
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
