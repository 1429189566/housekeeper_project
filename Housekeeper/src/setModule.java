//����ģ��
public class setModule {
	private int UserId;
	private int setId;
	private int userDataId;//����-�û���ϸ����Id
	private int moneyId;//Ǯ����Id
	private int ManageAppId;//����-����Ӧ��Id
	private setModule() {
	}

	private setModule(int userId, int setId, int userDataId, int moneyId, int manageAppId) {
		this.UserId = userId;
		this.setId = setId;
		this.userDataId = userDataId;
		this.moneyId = moneyId;
		this.ManageAppId = manageAppId;
	}

	/**
	 * @return setId
	 */
	public int getSetId() {
		return setId;
	}
	/**
	 * @param setId Ҫ���õ� setId
	 */
	public void setSetId(int setId) {
		this.setId = setId;
	}
	/**
	 * @return userDataId
	 */
	public int getUserDataId() {
		return userDataId;
	}
	/**
	 * @param userDataId Ҫ���õ� userDataId
	 */
	public void setUserDataId(int userDataId) {
		this.userDataId = userDataId;
	}
	/**
	 * @return moneyId
	 */
	public int getMoneyId() {
		return moneyId;
	}
	/**
	 * @param moneyId Ҫ���õ� moneyId
	 */
	public void setMoneyId(int moneyId) {
		this.moneyId = moneyId;
	}
	/**
	 * @return manageAppId
	 */
	public int getManageAppId() {
		return ManageAppId;
	}
	/**
	 * @param manageAppId Ҫ���õ� manageAppId
	 */
	public void setManageAppId(int manageAppId) {
		ManageAppId = manageAppId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	
	
}
