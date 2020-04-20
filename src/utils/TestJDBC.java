package utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;


public class TestJDBC {
	private Connection conn=null;
	private Statement st=null;
	private java.sql.PreparedStatement ps=null;
	private ResultSet rs=null;
	@Test
	public void find() throws SQLException{
		try {
			conn=JDBCUitl.getConn();
			st=conn.createStatement();
			String sql="select * from tb_user";
			rs=st.executeQuery(sql);
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"   ");
				System.out.print(rs.getString(2)+"   ");
				System.out.print(rs.getString(3)+"   ");
				System.out.print(rs.getInt(4)+"   ");
				System.out.print(rs.getString(5)+"   ");
				System.out.print(rs.getString(6)+"   ");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			JDBCUitl.close();
		}
	}

}
 