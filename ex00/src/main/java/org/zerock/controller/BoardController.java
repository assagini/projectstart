package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
//import org.zerock.domain.Criteria;
//import org.zerock.domain.PageMaker;
import org.zerock.service.BoardService;
/*
스프링 MVC의 Model객체는 해당 매소드에서 뷰(jsp등)에 필요한 데이터를 전달하는 용도로 사용됨
그래서 메소드 내에서 뷰로 전달할 데이터가 있다면, Model을 파라미터로 선언해주는 것이 편리함
*/

/*
등록을 위한 입력 페이지를 보는 경우(GET방식으로 처리)
실제로 데이터를 처리하는 부분(POST방식으로 처리)
*/
@Controller
@RequestMapping("/board/*")
public class BoardController {

  private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

  @Inject
  private BoardService service;		//BoardService객체를 주입받을 수 있도록 하기 위함

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public void registerGET(BoardVO board, Model model) throws Exception {

    logger.info("register get ...........");
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
  
   logger.info("regist post ...........");
   logger.info(board.toString());
  
   service.regist(board);
  
   //model.addAttribute("result", "success");		//model에 값을 넣는데 success라는 String값을 넣는것이다.
   													//이렇게 쓰면 주소창에 ?result=success라고 붙는다
  
   rttr.addFlashAttribute("msg", "SUCCESS");		//이건 주소창에 저렇게 나오지 말게 하는 코드이다. 쓰려면 매개변수에 RedirectAttributes 어쩌구 라고 써 준다.
   													//가보면 스크립트문에서 SUCCESS이면 alert창을 뜨게 해놨다.
   
   //return "/board/success";   //처음에 이 코드였는데 사용자가 도배 작업을 할 수 있다고 해서 redirect형식을 쓴다.
   return "redirect:/board/listAll";		//jsp만 만들면 되는 게 아님, jsp를 화면에 보여주려면 get방식 컨트롤러가 있어야 함
   											//redirect를 쓰면 컨트롤러를 search하고 안 쓰면 jsp파일을 search한다.
   }

  /*@RequestMapping(value = "/register", method = RequestMethod.POST)
  public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception {

    logger.info("regist post ...........");
    logger.info(board.toString());

    service.regist(board);

    
    return "redirect:/board/listAll";
  }
*/
  @RequestMapping(value = "/listAll", method = RequestMethod.GET)
  public void listAll(Model model) throws Exception {

    logger.info("show all list......................");
    model.addAttribute("list", service.listAll());		//잘 모르겠지만 이렇게 써야 데리고 화면에 값을 뿌릴 수 있나보다.
  }
/*
  @RequestMapping(value = "/read", method = RequestMethod.GET)
  public void read(@RequestParam("bno") int bno, Model model) throws Exception {

    model.addAttribute(service.read(bno));
  }

  @RequestMapping(value = "/remove", method = RequestMethod.POST)
  public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {

    service.remove(bno);

    rttr.addFlashAttribute("msg", "SUCCESS");

    return "redirect:/board/listAll";
  }

  @RequestMapping(value = "/modify", method = RequestMethod.GET)
  public void modifyGET(int bno, Model model) throws Exception {

    model.addAttribute(service.read(bno));
  }

  @RequestMapping(value = "/modify", method = RequestMethod.POST)
  public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception {

    logger.info("mod post............");

    service.modify(board);
    rttr.addFlashAttribute("msg", "SUCCESS");

    return "redirect:/board/listAll";
  }

  @RequestMapping(value = "/listCri", method = RequestMethod.GET)
  public void listAll(Criteria cri, Model model) throws Exception {

    logger.info("show list Page with Criteria......................");

    model.addAttribute("list", service.listCriteria(cri));
  }

  @RequestMapping(value = "/listPage", method = RequestMethod.GET)
  public void listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {

    logger.info(cri.toString());

    model.addAttribute("list", service.listCriteria(cri));
    PageMaker pageMaker = new PageMaker();
    pageMaker.setCri(cri);
    // pageMaker.setTotalCount(131);

    pageMaker.setTotalCount(service.listCountCriteria(cri));

    model.addAttribute("pageMaker", pageMaker);
  }

  @RequestMapping(value = "/readPage", method = RequestMethod.GET)
  public void read(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {

    model.addAttribute(service.read(bno));
  }

  @RequestMapping(value = "/removePage", method = RequestMethod.POST)
  public String remove(@RequestParam("bno") int bno, Criteria cri, RedirectAttributes rttr) throws Exception {

    service.remove(bno);

    rttr.addAttribute("page", cri.getPage());
    rttr.addAttribute("perPageNum", cri.getPerPageNum());
    rttr.addFlashAttribute("msg", "SUCCESS");

    return "redirect:/board/listPage";
  }

  @RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
  public void modifyPagingGET(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model)
      throws Exception {

    model.addAttribute(service.read(bno));
  }*/

}
