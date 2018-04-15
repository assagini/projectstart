package org.zerock.web;

public class annotaion {
/*
	
애노테이션
설명
사용
	
@Controller
Controller 객체임을 명시/ 자바 클래스를 스프링 빈이라고 표시하는 역할을 한다. 이 어노테이션을 사용함으로써 스프링의 component-scanning 기술이 이 클래스를 어플리케이션 컨텍스트에 빈으로 등록하게 된다. 
클래스

@Repository
DAO 객채임을 명시/ @Component 어노테이션을 써도 상관없지만, DAO 클래스들에 @Repository 어노테이션을 사용함으로써 @Component 어노테션이 가진 특성과 함께, DAO의 메소드에서 발생할 수 있는 unchecked exception들을 스프링의 DataAccessException으로 처리할 수 있는 장점 또한 갖을 수 있다.
클래스

@Service
Service 객체임을 명시/ MVC 패턴에서 Controller 클래스에 선언되어진다. 이 또한 @Component 로 대체할 수 있다. 하지만, @Controller 어노테이션을 사용함으로써 @RequestMapping 등의 추가적인 어노테이션을 사용할 수 있게 된다.
클래스

@RequestMapping
특정 URI에 매칭되는 클래스나, 메서드임을 명시
클래스, 메소드

@RequestParam
요청에서 특정한 파라미터 값을 찾아낼 때 사용
파라미터

@RequestHeader
요청에서 특정 HTTP 헤더 정보를 추출할 때 사용
파라미터

@PathVariable
현재의 URI에서 원하는 정보를 추출할 때 사용
파라미터

@CookieValue
현재 사용자의 쿠키가 존재하는 경우 쿠키의 이름을 이용해서 쿠키 값을 추출
파라미터

@ModelAttribute
자동으로 해당 객체를 뷰까지 전달하도록 만드는 애너테이션
메소드, 파라미터

@SessionAttribute
세션상에서 모델의 정보를 유지하고 싶은 경우 사용
클래스

@InitBinder
파라미터를 수집해서 객체로 만들 경우
메소드

@ResponseBody
리턴타입이 HTTP의 응답메시지로 전송
메소드, 리턴타입

@RequestBody
요청 문자열이 그대로 파라미터로 전달
파라미터

	*/
}
