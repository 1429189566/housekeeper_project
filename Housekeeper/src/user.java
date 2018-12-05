
public class user {
	private int userId;
	private int msgId;//��Ϣģ��Id
	private int setId;//����ģ��Id
	private int contactsId;//��ϵ��ģ��Id
	private chatModule chat;
	private contactsModule contacts;
	private setModule set;

	public user(int userId, int msgId, int setId, int contactsId) 
	{
		this.userId = userId;
		this.msgId = msgId;
		this.setId = setId;
		this.contactsId = contactsId;
	}

	public chatModule getChat() {
		return chat;
	}
	public void setChat() {
		this.chat = new chatModule(this.userId, this.msgId);
	}
	public contactsModule getContacts() {
		return contacts;
	}
	public void setContacts(contactsModule contacts) {
		this.contacts = new contactsModule(this.userId, this.contactsId);
	}
	public setModule getSet() {
		return set;
	}
	public void setSet(setModule set) {
		this.set = new setModule(this.userId, this.setId);
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getmsgId() {
		return msgId;
	}
	public void setmsgId(int msgId) {
		this.msgId = msgId;
	}
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	public int getContactsId() {
		return contactsId;
	}
	public void setContactsId(int contactsId) {
		this.contactsId = contactsId;
	}
	
	
}
