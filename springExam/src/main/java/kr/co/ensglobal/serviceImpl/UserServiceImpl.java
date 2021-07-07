package kr.co.ensglobal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.co.ensglobal.VO.LoginVO;
import kr.co.ensglobal.VO.UserInfoVO;
import kr.co.ensglobal.VO.UserVO;
import kr.co.ensglobal.dao.UserDao;
import kr.co.ensglobal.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public int Login(LoginVO loginVO) {
		return userDao.Login(loginVO);
	}

	@Override
	public UserVO GetUserName(String userId) {
		return userDao.GetUserName(userId);
	}

	@Override
	public List<UserInfoVO> GetUserList() {

		return userDao.GetUserList();
	}
}
