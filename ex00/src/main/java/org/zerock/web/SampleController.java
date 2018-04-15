package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SampleController {

	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")		//url에 localhost:9080/doA라고 찍으면 이부분이 실행이 됨
	public void doA(){			//근데 지금 리턴에 void이다. 이때는 WEB-INF밑에 views밑에 doA.jsp파일을 찾아 실행함
		
		logger.info("doA called....................");
		
	}
	
	@RequestMapping("doB")
	public void doB(){
		
		logger.info("doB called....................");
		
	}
	
}