package jdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSDemo {

	public static void main(String[] args) {

		Connection conn = DBUtil.getDBConnection();

		// INSERT
		String insert = "insert into dept values(?,?,?)"; // ? positional parameters

		/*
		 * try { PreparedStatement pstmt = conn.prepareStatement(insert);
		 * 
		 * 
		 * pstmt.setInt(1, 80); pstmt.setString(2,"Logistics");
		 * pstmt.setString(3,"Noida");
		 * 
		 * 
		 * int count = pstmt.executeUpdate();
		 * 
		 * System.out.println(count);
		 * 
		 * } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		// UPDATE

		/*
		 * String update = "update dept set dname = ? , location = ? where dno = ?";
		 * 
		 * try { PreparedStatement pstmt = conn.prepareStatement(update);
		 * 
		 * pstmt.setString(1,"Tours&Travels"); pstmt.setString(2, "Greater Noida");
		 * pstmt.setInt(3, 80);
		 * 
		 * 
		 * int count = pstmt.executeUpdate();
		 * 
		 * System.out.println("record update is "+count);
		 * 
		 * } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		// SELECT BY DNO
		
		//String selectById = "select dno,dname,location from dept where dno > ?";
		
		// SELECT ALL
		
		String selectAll = "select dno,dname,location from dept";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(selectAll);

					//pstmt.setInt(1, 50);

				ResultSet rs =		pstmt.executeQuery();

			while (rs.next()) {
				int dID = rs.getInt("dno");
				String dname = rs.getString("dname");
				String loc = rs.getString("location");
				System.out.println("Department ID: " + dID +
						", Department Name: " + dname +
						", Location: " + loc);

				/*// Retrieve data from the result set
				int departmentId = resultSet.getInt("deptno");
				String departmentName = resultSet.getString("dname");
				String location = resultSet.getString("loc");

				// Perform further processing with retrieved data
				System.out.println("Department ID: " + departmentId +
						", Department Name: " + departmentName +
						", Location: " + location);*/
			}






		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
