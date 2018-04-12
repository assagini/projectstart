package org.zerock.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisTest {

	@Inject 
	private SqlSessionFactory sqlFactory;    //문> 스프링이 정상적으로 동작할 경우 SqlSessionFactory를 주입시켜줄 것을 요구
	
	@Test
	public void testFactory(){
		
		System.out.println(sqlFactory);
		
	}
	
	@Test
	public void testSession()throws Exception{
		
		try(SqlSession session = sqlFactory.openSession()){     //실제 데이터베이스와의 연결을 담당하는 객체인 SqlSession을 생성하는 부분
			
			System.out.println(session);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}


