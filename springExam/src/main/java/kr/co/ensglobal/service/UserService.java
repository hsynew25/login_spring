package kr.co.ensglobal.service;

import java.util.List;

import kr.co.ensglobal.VO.LoginVO;
import kr.co.ensglobal.VO.UserInfoVO;
import kr.co.ensglobal.VO.UserVO;

public interface UserService {
	// 로그인 성공 여부 판별
	public int Login(LoginVO loginVO) throws Exception;

	// 로그인 성공 시 유저이름 get
	public UserVO GetUserName(String userId) throws Exception;
	
	public List<UserInfoVO> GetUserList() throws Exception;
}
