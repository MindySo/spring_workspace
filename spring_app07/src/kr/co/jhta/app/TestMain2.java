package kr.co.jhta.app;

import java.util.List;

import kr.co.jhta.app.dao.OracleDAO;
import kr.co.jhta.app.dto.DeptDTO;

public class TestMain2 {
	public static void main(String[] args) {
		OracleDAO dao = new OracleDAO();
		
		// db 접속
		dao.connect();
		
		List<DeptDTO> list = dao.selectAll();
		for(DeptDTO dto : list) {
			System.out.println(dto);
		}
		
		System.out.println("============================");
		System.out.println("select test");

		DeptDTO dto10 = dao.selectOne(10);
		System.out.println(dto10);
		
		System.out.println("============================");
		System.out.println("update test");
		
		dto10.setDname("경영");
		dto10.setLoc("서울");
		
		dao.updateOne(dto10);
		
		dto10 = dao.selectOne(10);
		System.out.println(dto10);

		System.out.println("============================");
		System.out.println("insert test");

		DeptDTO dto2 = new DeptDTO(98, "회계", "부산");
		dao.insertOne(dto2);
	
		System.out.println("============================");
		System.out.println("delete test");
		
		dao.deleteOne(98);
		DeptDTO dto98 = dao.selectOne(98);
		
		System.out.println("삭제되면 null : " + dto98);
		
		dao.close();
	}
}
