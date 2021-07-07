package kr.co.ensglobal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ensglobal.VO.LoginVO;
import kr.co.ensglobal.VO.UserInfoVO;
import kr.co.ensglobal.VO.UserVO;
import kr.co.ensglobal.mapper.UserMapper;

@Repository
public class UserDao {

	@Autowired
	private UserMapper userMapper;

	public int Login(LoginVO loginVO) {
		return userMapper.Login(loginVO);
	}

	public UserVO GetUserName(String userId) {
		return userMapper.GetUserName(userId);
	}
	
	public List<UserInfoVO> GetUserList() {
		List<UserInfoVO> userList = userMapper.GetUserList();
		System.out.println("!@# user list : "+ userList);
		return userMapper.GetUserList();
	}

}
