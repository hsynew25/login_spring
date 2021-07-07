package kr.co.ensglobal.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import kr.co.ensglobal.VO.UserInfoVO;
import kr.co.ensglobal.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("list")
	public ResponseEntity List() throws Exception{
		List<UserInfoVO> userList;
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json; charset=utf-8");
		
		try {
			userList = userService.GetUserList();
			if(userList.size() != 0) {
				System.out.println("*get success*");
				headers.set("responseMessage", "get success");
			}else {
				headers.set("responseMessage", "get success,but no data");
			}
			return ResponseEntity.ok().headers(headers).body(userList);
		}catch (Exception e) {
			e.printStackTrace();
		}

		return ResponseEntity.notFound().build();
	}
}
