package kr.co.ensglobal.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@RequestMapping("list")
	public String list() {
		return "user list 한글 korean";
	}
}
