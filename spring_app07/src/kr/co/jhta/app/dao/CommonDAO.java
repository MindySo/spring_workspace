package kr.co.jhta.app.dao;

import java.sql.Connection;
import java.util.List;

import kr.co.jhta.app.dto.DeptDTO;

public interface CommonDAO {
	public Connection connect();
	public List<DeptDTO> selectAll();
	public DeptDTO selectOne(int deptno);
	public void insertOne(DeptDTO dto);
	public void updateOne(DeptDTO dto);
	public void deleteOne(int deptno);
	public void close();
	
}
