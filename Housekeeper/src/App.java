
public class App {
	private int AppId;
	private String AppName;
	private String AppIcon;//Ӧ��ͼ���ַ
	private App() {
	}
	private App(int appId, String appName, String appIcon) {
		AppId = appId;
		AppName = appName;
		AppIcon = appIcon;
	}
	/**
	 * @return appId
	 */
	public int getAppId() {
		return AppId;
	}
	/**
	 * @param appId Ҫ���õ� appId
	 */
	public void setAppId(int appId) {
		AppId = appId;
	}
	/**
	 * @return appName
	 */
	public String getAppName() {
		return AppName;
	}
	/**
	 * @param appName Ҫ���õ� appName
	 */
	public void setAppName(String appName) {
		AppName = appName;
	}
	/**
	 * @return appIcon
	 */
	public String getAppIcon() {
		return AppIcon;
	}
	/**
	 * @param appIcon Ҫ���õ� appIcon
	 */
	public void setAppIcon(String appIcon) {
		AppIcon = appIcon;
	}
	
}
