package anypet.ksmartteam01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class UserBoardController {
	
	@GetMapping("/boardList")
	public String boardList() {
		return "/user/board/boardList";
	}
	
	@GetMapping("/addBoard")
	public String addBoard() {
		return "/user/board/addBoard";
	}
	
	@GetMapping("/readBoard")
	public String readBoard() {
		return "/user/board/readBoard";
	}
	
	@GetMapping("/modifyBoard")
	public String modifyBoard() {
		return "/user/board/modifyBoard";
	}
	
}
