import java.util.ArrayList;
import java.util.List;

public class setModule_ManageApp {
	private int ManageAppId;//����Ӧ��Id
	private List<Integer> AddAppId = new ArrayList<Integer>();//���Ӧ��Id
	private List<Integer> ManageAppGroupId = new ArrayList<Integer>();//����Ӧ������Id
	private int MsgManageId;//������Ϣ�����Id
	
	private setModule_ManageApp() {
	}
	
	private setModule_ManageApp(int manageAppId, List<Integer> addAppId, List<Integer> manageAppGroupId, int msgManageId) {
		this.ManageAppId = manageAppId;
		this.AddAppId = addAppId;
		this.ManageAppGroupId = manageAppGroupId;
		this.MsgManageId = msgManageId;
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
	/**
	 * @return addAppId
	 */
	public List<Integer> getAddAppId() {
		return AddAppId;
	}
	/**
	 * @param addAppId Ҫ���õ� addAppId
	 */
	public void addAddAppId(Integer addAppId) {
		AddAppId.add(addAppId);
	}
	/**
	 * @return manageAppGroupId
	 */
	public List<Integer> getManageAppGroupId() {
		return ManageAppGroupId;
	}
	/**
	 * @param manageAppGroupId Ҫ���õ� manageAppGroupId
	 */
	public void addManageAppGroupId(Integer manageAppGroupId) {
		ManageAppGroupId.add(manageAppGroupId);
	}
	/**
	 * @return msgManageId
	 */
	public int getMsgManageId() {
		return MsgManageId;
	}
	/**
	 * @param msgManageId Ҫ���õ� msgManageId
	 */
	public void setMsgManageId(int msgManageId) {
		MsgManageId = msgManageId;
	}
	
}
