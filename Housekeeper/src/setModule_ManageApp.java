import java.util.ArrayList;
import java.util.List;

public class setModule_ManageApp {
	private int manageAppId;//����Ӧ��Id
	private List<Integer> addAppId = new ArrayList<Integer>();//���Ӧ��Id
	private List<Integer> manageAppGroupId = new ArrayList<Integer>();//����Ӧ������Id
	private int msgManageId;//������Ϣ�����Id
	
	public setModule_ManageApp() {
	}
	
	public setModule_ManageApp(int manageAppId) {
		this.manageAppId = manageAppId;
	}
	
	public setModule_ManageApp(int manageAppId, List<Integer> addAppId, List<Integer> manageAppGroupId, int msgManageId) {
		this.manageAppId = manageAppId;
		this.addAppId = addAppId;
		this.manageAppGroupId = manageAppGroupId;
		this.msgManageId = msgManageId;
	}
	/**
	 * @return manageAppId
	 */
	public int getmanageAppId() {
		return manageAppId;
	}
	/**
	 * @param manageAppId Ҫ���õ� manageAppId
	 */
	public void setmanageAppId(int manageAppId) {
		this.manageAppId = manageAppId;
	}
	/**
	 * @return addAppId
	 */
	public List<Integer> getaddAppId() {
		return addAppId;
	}
	/**
	 * @param addAppId Ҫ���õ� addAppId
	 */
	public void addaddAppId(Integer addAppId) {
		this.addAppId.add(addAppId);
	}
	/**
	 * @return manageAppGroupId
	 */
	public List<Integer> getmanageAppGroupId() {
		return manageAppGroupId;
	}
	/**
	 * @param manageAppGroupId Ҫ���õ� manageAppGroupId
	 */
	public void addmanageAppGroupId(Integer manageAppGroupId) {
		this.manageAppGroupId.add(manageAppGroupId);
	}
	/**
	 * @return msgManageId
	 */
	public int getmsgManageId() {
		return msgManageId;
	}
	/**
	 * @param msgManageId Ҫ���õ� msgManageId
	 */
	public void setmsgManageId(int msgManageId) {
		this.msgManageId = msgManageId;
	}
	
}
