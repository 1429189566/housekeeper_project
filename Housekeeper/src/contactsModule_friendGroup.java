public class contactsModule_friendGroup {
	private int friendGroupId;//������ϵ��Ⱥ��Id
	private int friendGroupName;//��ϵ��Ⱥ������
	private contactsModule_friendGroup() {
	}
	private contactsModule_friendGroup(int friendGroupId, int friendGroupName) {
		this.friendGroupId = friendGroupId;
		this.friendGroupName = friendGroupName;
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
	 * @return friendGroupName
	 */
	public int getFriendGroupName() {
		return friendGroupName;
	}
	/**
	 * @param friendGroupName Ҫ���õ� friendGroupName
	 */
	public void setFriendGroupName(int friendGroupName) {
		this.friendGroupName = friendGroupName;
	}
	
	
}
