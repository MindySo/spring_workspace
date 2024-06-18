package spring_app04;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
//		OracleDAO dao = new OracleDAO();
//		
//		Connection conn = dao.connect();
//		System.out.println("conn : " + conn);
//		
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		CommonDAO dao = factory.getBean("dao", CommonDAO.class);
		
		dao.connect();
		List<DeptDTO> list = dao.selectAll();
		for(DeptDTO dto : list) {
			System.out.println(dto);
		}
	}
}
