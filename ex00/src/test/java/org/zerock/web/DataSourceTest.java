package org.zerock.web;

import java.sql.Connection;
import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// DataSource 태스트 진행
@RunWith(SpringJUnit4ClassRunner.class)  //현재 테스트 코드를 실행할 때 스프링이 로딩되도록 하는 부분
@ContextConfiguration(  //현재 테스트 코드를 실행할 때 스프링이 로딩되도록 하는 부분
	locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})  //원래 root-context가 *였다. 에러가 나서 고쳤다.
public class DataSourceTest {

	@Inject  //이 어노테이션을 쓰면 개발자는 밑에서 객체를 생성하지 않고도 객체를 쓸 수 있다.
	private DataSource ds;
	
	@Test
	public void testConection()throws Exception{
		
		try(Connection con = ds.getConnection()){
			
			System.out.println(con);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


