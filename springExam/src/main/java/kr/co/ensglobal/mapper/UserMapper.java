package kr.co.ensglobal.mapper;

import kr.co.ensglobal.VO.LoginVO;
import kr.co.ensglobal.VO.UserVO;

public interface UserMapper {
	public int Login(LoginVO loginVO);

	public UserVO GetUserName(String userId);
}
