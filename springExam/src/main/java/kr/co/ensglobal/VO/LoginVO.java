package kr.co.ensglobal.VO;

public class LoginVO {
	private String userId;
	private String userPw;

	public LoginVO() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	@Override
	public String toString() {
		return "LoginVO [userId=" + userId + ", userPw=" + userPw + "]";
	}
}
