package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUitl {
	
	private static Connection conn=null;
	private static java.sql.Statement st=null;
	private static java.sql.PreparedStatement ps=null;
	private static ResultSet rs=null;

	public static Connection getConn() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/shopping?setUnicode=true&characterEncoding=utf-8";
		String name="root";
		String password="";
		Connection conn=DriverManager.getConnection(url,name,password);
		return conn;
	}
	
	//public static void main(String[] arges) throws ClassNotFoundException, SQLException{
	//	Connection conn = JDBCUitl.getConn();
	//	if(conn!=null){
	//		System.out.println("success数据库");
	//	}
	//	else{
	//		System.out.println("faile数据库");
	//	}
	//}
	
	public static void close(){
		if(st!=null)
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(ps!=null)
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void release(java.sql.PreparedStatement ps2, Connection conn2) {
		// TODO Auto-generated method stub
		
	}
	
}
