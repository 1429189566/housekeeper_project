
public class setModule_UserData {
	private int UserId;
	private int UserNum;//�û��˺�
	private String UserName;
	private String UserSex;
	private String UserPhone;
	private int UserAge;
	private setModule_UserData() {
	}
	private setModule_UserData(int userId, int userNum, String userName, String userSex, String userPhone,
			int userAge) {
		UserId = userId;
		UserNum = userNum;
		UserName = userName;
		UserSex = userSex;
		UserPhone = userPhone;
		UserAge = userAge;
	}
	/**
	 * @return userId
	 */
	public int getUserId() {
		return UserId;
	}
	/**
	 * @param userId Ҫ���õ� userId
	 */
	public void setUserId(int userId) {
		UserId = userId;
	}
	/**
	 * @return userNum
	 */
	public int getUserNum() {
		return UserNum;
	}
	/**
	 * @param userNum Ҫ���õ� userNum
	 */
	public void setUserNum(int userNum) {
		UserNum = userNum;
	}
	/**
	 * @return userName
	 */
	public String getUserName() {
		return UserName;
	}
	/**
	 * @param userName Ҫ���õ� userName
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}
	/**
	 * @return userSex
	 */
	public String getUserSex() {
		return UserSex;
	}
	/**
	 * @param userSex Ҫ���õ� userSex
	 */
	public void setUserSex(String userSex) {
		UserSex = userSex;
	}
	/**
	 * @return userPhone
	 */
	public String getUserPhone() {
		return UserPhone;
	}
	/**
	 * @param userPhone Ҫ���õ� userPhone
	 */
	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}
	/**
	 * @return userAge
	 */
	public int getUserAge() {
		return UserAge;
	}
	/**
	 * @param userAge Ҫ���õ� userAge
	 */
	public void setUserAge(int userAge) {
		UserAge = userAge;
	}
	
	
}