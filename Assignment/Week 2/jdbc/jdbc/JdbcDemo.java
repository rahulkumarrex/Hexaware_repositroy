package jdbc;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        Connection conn = null;

        // step1

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // step2

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db", "root", "12345");

            // step3

            String insert = "insert into Employees(eid,ename,salary,job) values(112,'Don',70000,'MD')";

            Statement stmt = conn.createStatement();

            int count = stmt.executeUpdate(insert);

            System.out.println(count + " records effected");

            ResultSet rs = stmt.executeQuery("select * from dept");



        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {

            try {
                conn.close();
            }
            catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

}
