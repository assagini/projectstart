package org.zerock.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	
	@Inject
    private BoardDAO dao;

	private static Logger logger = 
			LoggerFactory.getLogger(BoardDAOTest.class);
	//하나씩 순차적으로 주석 처리하고 해제하고 그러면서 테스트하면 됨. 그런데 read는 아직 reply가 작성 안 되서 에러뜸
	

/*	@Test
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣습니다.");
		board.setContent("새로운 글을 넣습니다.");
		board.setWriter("user00");
		dao.create(board);
	}*/

	@Test
	public void testRead() throws Exception{
		logger.info(dao.read(3).toString());
	}

/*	@Test
	public void testUpdate() throws Exception {
		
		BoardVO board = new BoardVO();
		board.setBno(3);
		board.setTitle("수정된 글입니다.");
		board.setContent("수정 테스트");
		dao.update(board);
	}*/
	
/*	@Test
	public void testDelete() throws Exception{
		dao.delete(4);
	}
	*/
}
