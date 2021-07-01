package kr.co.ensglobal.service;

import kr.co.ensglobal.VO.LoginVO;
import kr.co.ensglobal.VO.UserVO;

public interface UserService {
	// 로그인 성공 여부 판별
	public int Login(LoginVO loginVO) throws Exception;

	// 로그인 성공 시 유저이름 get
	public UserVO GetUserName(String userId) throws Exception;
}
