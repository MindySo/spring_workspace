package spring_app04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLDAO implements CommonDAO {

	// 멤버변수
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/xe";
	String user = "scott";
	String password = "tiger";
	Connection conn;
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();
	
	@Override
	public Connection connect() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}

	@Override
	public List<DeptDTO> selectAll() {
		sb.setLength(0);
		sb.append("SELECT deptno, dname, loc FROM dept");
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
