//����ģ��
public class chatModule {
	private int UserId;//�û�Id
	private int MsgId;//��ϢId
	private int AppId;//Ӧ��Id
	private int MsgPeopleId;//��Ϣ�ܼҵ���Ϣ����Id����Ϣ��һ��ȫ�����ⲿӦ�ã�Ҳ����Ϣ�ܼұ���ĺ�����Ϣ��
	private String MsgSubject;//����Ӧ�õ���Ϣ���壬������QQ�к��ѷ����С�ַ�������Ϣ
	private String MsgText;//��Ϣ����
	private int MsgGradeId;//��Ϣ�ȼ�Id����Ϣ��Ҫ�̶ȣ���ͨ�����õȼ���ʹ�ò�ͬ��ɫ�ʹ���
	private String MsgIcon;//����Ӧ�õ�ͼ�꣬�����ŵ��ǵ�ַ
	
	private chatModule() {
	}

	private chatModule(int userId, int msgId, int appId, int msgPeopleId, String msgSubject, String msgText, int msgGradeId, String msgIcon) {
		this.UserId = userId;
		this.MsgId = msgId;
		this.AppId = appId;
		this.MsgPeopleId = msgPeopleId;
		this.MsgSubject = msgSubject;
		this.MsgText = msgText;
		this.MsgGradeId = msgGradeId;
		this.MsgIcon = msgIcon;
	}
	
	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public int getMsgId() {
		return MsgId;
	}

	public void setMsgId(int msgId) {
		MsgId = msgId;
	}

	public int getAppId() {
		return AppId;
	}

	public void setAppId(int appId) {
		AppId = appId;
	}

	public int getMsgPeopleId() {
		return MsgPeopleId;
	}

	public void setMsgPeopleId(int msgPeopleId) {
		MsgPeopleId = msgPeopleId;
	}

	public String getMsgSubject() {
		return MsgSubject;
	}

	public void setMsgSubject(String msgSubject) {
		MsgSubject = msgSubject;
	}

	public String getMsgText() {
		return MsgText;
	}

	public void setMsgText(String msgText) {
		MsgText = msgText;
	}

	public int getMsgGradeId() {
		return MsgGradeId;
	}

	public void setMsgGradeId(int msgGradeId) {
		MsgGradeId = msgGradeId;
	}

	public String getMsgIcon() {
		return MsgIcon;
	}

	public void setMsgIcon(String msgIcon) {
		MsgIcon = msgIcon;
	}
	
}
