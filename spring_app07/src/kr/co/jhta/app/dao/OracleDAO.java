package kr.co.jhta.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.jhta.app.dto.DeptDTO;

public class OracleDAO implements CommonDAO {

	// 멤버변수
	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USER = "scott";
	final static String PASSWORD = "tiger";
	Connection conn;

	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();

	@Override
	public Connection connect() {

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

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
			while (rs.next()) {
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

	@Override
	public DeptDTO selectOne(int deptno) {

		sb.setLength(0);
		sb.append("SELECT deptno, dname, loc FROM dept WHERE deptno = ?");
		DeptDTO dto = null;

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				dto = new DeptDTO(deptno, dname, loc);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dto;
	}

	@Override
	public void insertOne(DeptDTO dto) {
		sb.setLength(0);
		sb.append("INSERT INTO dept ");
		sb.append("VALUES (DEPT_DEPTNO.nextval, ?, ? )");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateOne(DeptDTO dto) {
		sb.setLength(0);
		sb.append("UPDATE dept SET ");
		sb.append("dname = ? , loc = ?");
		sb.append("WHERE deptno = ?");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getLoc());
			pstmt.setString(2, dto.getDname());
			pstmt.setInt(3, dto.getDeptno());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteOne(int deptno) {

		sb.setLength(0);
		sb.append("DELETE FROM dept WHERE deptno = " + deptno);

		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
