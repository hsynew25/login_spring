package kr.co.ensglobal.VO;

public class UserInfoVO {
	private String userId;
	private String userName;
	private String position;
	private String posNum;
	private String email;
	private String phone;
	private String age;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosNum() {
		return posNum;
	}

	public void setPosNum(String posNum) {
		this.posNum = posNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfoVO [userId=" + userId + ", userName=" + userName + ", position=" + position + ", posNum="
				+ posNum + ", email=" + email + ", phone=" + phone + ", age=" + age + "]";
	}


}
