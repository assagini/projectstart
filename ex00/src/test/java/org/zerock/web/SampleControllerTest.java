package org.zerock.web;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration		//이거이거 이게 제일 큰 차이래
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SampleControllerTest {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleControllerTest.class);

	@Inject
    private WebApplicationContext wac;

    private MockMvc mockMvc;		//이간 브라우저에서 요청과 응답을 의미하는 객체로 간주
    
    @Before
    public void setup() {		//매번 테스트를 진행할 때마다 가상의 요청과 응답을 처리하기 위해서 setup() 메소드에서는 @Before 애노테이션으로 처리되어 매번 테스트 메소드의 실행 전에 MockMvc객체를 만들어내게 된다.
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        logger.info("setup............");
    }
    
    @Test
    public void testDoA() throws Exception{
    	mockMvc.perform(MockMvcRequestBuilders.get("/doA"));
    }

}