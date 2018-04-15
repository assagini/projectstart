package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController4.class);

	@RequestMapping("/doE")		////url에 localhost:9080/doE라고 찍으면 이부분이 실행이 됨
	public String doE(RedirectAttributes rttr){
		logger.info("doE called but redirect to /doF.............");
		
		rttr.addFlashAttribute("msg", "This is the Message!! with redirected");		//임시데이터를 전달한다고 하네.
		return "redirect:/doF";		//이걸 쓰면 주소창에 localhost:9080/doF 이게 찍혀서 실행됨. 새창이 뜨는 것이 아님
	}
	
	@RequestMapping("/doF")
	public void doF(String msg){
		
		logger.info("doF called..............."+ msg);
	}
}


