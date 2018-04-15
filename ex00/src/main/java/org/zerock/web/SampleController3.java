package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController3 {

	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("/doD")		//url에 localhost:9080/doD라고 찍으면 이부분이 실행이 됨
	public String doD(Model model){		//여기 매개변수로 model을 써줬다.
		
		//make sample data
		ProductVO product = new ProductVO("Sample Product", 10000);
		
		logger.info("doD");
	
		model.addAttribute(product);		//model에 product객체를 넣어줬다.
											//addAtrribute(객체) : 이름을 지정하지 않는 경우에는 자동으로 저장되는 객체의 클래스명 앞 글자를 소문자로 처리한 클래스명을 이름으로 간주
											//addAttribute("이름", 객체) : 객체에 특별한 이름을 부여해 뷰에서 이름값을 이용하여 객체 처리
											//jsp파일로 가서 확인해봐라.
											//model은 그냥 상자로 생각하란다.
		
		return "productDetail";		//productDetail.jsp를 찾는다.
		
	}
	
}