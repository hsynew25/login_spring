package kr.co.ensglobal.mapper;

import java.util.List;

import kr.co.ensglobal.VO.LoginVO;
import kr.co.ensglobal.VO.UserInfoVO;
import kr.co.ensglobal.VO.UserVO;

public interface UserMapper {
	public int Login(LoginVO loginVO);

	public UserVO GetUserName(String userId);
	
	public List<UserInfoVO> GetUserList();
}
