//����ģ��
public class chatModule {
	private int userId;//�û�Id
	private int msgId;//��ϢId
	private int appId;//Ӧ��Id(�����ⲿ��ϢӦ�õ���Ϣ)
	private int msgPeopleId;//��Ϣ�ܼҵ���Ϣ����Id����Ϣ��һ��ȫ�����ⲿӦ�ã�Ҳ����Ϣ�ܼұ���ĺ�����Ϣ��
	private String msgSubject;//����Ӧ�õ���Ϣ���壬������QQ�к��ѷ����С�ַ�������Ϣ��������������QQ�к��ѷ����С��
	private String msgText;//��Ϣ����
	private int msgGradeId;//��Ϣ�ȼ�Id����Ϣ��Ҫ�̶ȣ���ͨ�����õȼ���ʹ�ò�ͬ��ɫ�ʹ���
	private String msgIcon;//����Ӧ�õ�ͼ�꣬�����ŵ��ǵ�ַ
	
	public chatModule() {
	}
	
	public chatModule(int userId,int msgId) {
		this.userId = userId;
		this.msgId = msgId;
	}
	
	public chatModule(int userId, int msgId, int appId, int msgPeopleId, String msgSubject, String msgText, int msgGradeId, String msgIcon) {
		this.userId = userId;
		this.msgId = msgId;
		this.appId = appId;
		this.msgPeopleId = msgPeopleId;
		this.msgSubject = msgSubject;
		this.msgText = msgText;
		this.msgGradeId = msgGradeId;
		this.msgIcon = msgIcon;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMsgId() {
		return msgId;
	}

	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public int getMsgPeopleId() {
		return msgPeopleId;
	}

	public void setMsgPeopleId(int msgPeopleId) {
		this.msgPeopleId = msgPeopleId;
	}

	public String getMsgSubject() {
		return msgSubject;
	}

	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}

	public String getMsgText() {
		return msgText;
	}

	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}

	public int getMsgGradeId() {
		return msgGradeId;
	}

	public void setMsgGradeId(int msgGradeId) {
		this.msgGradeId = msgGradeId;
	}

	public String getMsgIcon() {
		return msgIcon;
	}

	public void setMsgIcon(String msgIcon) {
		this.msgIcon = msgIcon;
	}
	

}
