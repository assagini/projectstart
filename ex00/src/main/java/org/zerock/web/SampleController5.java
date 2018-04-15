package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

//JSON처리를 하는 거라는데
@Controller
public class SampleController5 {

	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON(){		//리턴타입으로 @ResponseBody ProductVO를 써주고
		
		ProductVO vo = new ProductVO("샘플상품",30000);
		
		return vo;		//리턴이 String이 아니다. 참조변수이다. 그러면 화면에는 참조변수에 들어간 내용이 표시된다.
		
	}
}
