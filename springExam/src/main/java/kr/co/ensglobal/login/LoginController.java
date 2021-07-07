package kr.co.ensglobal.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ensglobal.VO.LoginVO;
import kr.co.ensglobal.VO.UserVO;
import kr.co.ensglobal.service.UserService;

// @RestController : JSON 형태로 객체를 반환
@RestController
@RequestMapping("/api/user/")
public class LoginController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "login")
	public ResponseEntity Login(@RequestBody LoginVO loginVO) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json; charset=utf-8");

		// 로그인 성공 시 유저 이름 및 아이디 담아서 전달
		UserVO userVO = new UserVO();

		// count == 1 : 로그인 성공
		// 나머지 경우 : 로그인 실패
		int count = -1;
		try {
			count = userService.Login(loginVO);
		} catch (Exception e) {
			System.out.println(e);
		}

		// 로그인 성공 시 유저네임 가져오기
		if (count == 1) {
			System.out.println("login success!");
			headers.set("responseMessage", "login success");
			try {
				userVO = userService.GetUserName(loginVO.getUserId());
			} catch (Exception e) {
				System.out.println(e);
			}

			// ok : status code 200
			return ResponseEntity.ok().headers(headers).body(userVO);
		}

		// 로그인 실패
		else {
			System.out.println("login fail~");
			headers.set("responseMessage", "login fail");

			// unauthorized : status code 401
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).headers(headers).build();
		}
	}
}
