//ÿ����ϵ��ģ��
public class contactsModule {
	private int UserId;
	private int friendId;
	private int friendGroupId;//��ϵ��Ⱥ��Id
	private String friendName;
	
	private contactsModule() {

	}

	private contactsModule(int userId, int friendId, int friendGroupId, String friendName) {
		this.UserId = userId;
		this.friendId = friendId;
		this.friendGroupId = friendGroupId;
		this.friendName = friendName;
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
	 * @return friendId
	 */
	public int getFriendId() {
		return friendId;
	}

	/**
	 * @param friendId Ҫ���õ� friendId
	 */
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}

	/**
	 * @return friendGroupId
	 */
	public int getFriendGroupId() {
		return friendGroupId;
	}

	/**
	 * @param friendGroupId Ҫ���õ� friendGroupId
	 */
	public void setFriendGroupId(int friendGroupId) {
		this.friendGroupId = friendGroupId;
	}

	/**
	 * @return friendName
	 */
	public String getFriendName() {
		return friendName;
	}

	/**
	 * @param friendName Ҫ���õ� friendName
	 */
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	
}
