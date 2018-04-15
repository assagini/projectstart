package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController2.class);

	@RequestMapping("doC")		//url에 localhost:9080/doC라고 찍으면 이부분이 실행이 됨
	public String doC(@ModelAttribute("msg") String msg){		//자세히는 모르겠고, ModelAttribute를 쓰면 주소창에서 값을 넘길 수 있다.
																//msg라는 아이디를 썼다. 주소창에 ?msg=love라고 치고
																//jsp파일에서 ${msg}라고 써주면 love가 찍힌다.
		
		logger.info("doC called..............................");
		
		return "result";		//얘는 return타입이 result라는 string이다. 그러면 result.jsp를 찾는다.
		
	}
}