
public class setModule_Purse {
	private int moneyId;//Ǯ����Id
	private int serviceNum;//����Χ�����ֱ�ʾ�����Ʒ���Ӧ�ø�������ʼֵΪ3
	
	private setModule_Purse() {
	}

	private setModule_Purse(int moneyId) {
		this.moneyId = moneyId;
		this.serviceNum = 3;
	}
	
	private setModule_Purse(int moneyId, int serviceNum) {
		this.moneyId = moneyId;
		this.serviceNum = serviceNum;
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
	 * @return serviceNum
	 */
	public int getServiceNum() {
		return serviceNum;
	}

	/**
	 * @param serviceNum Ҫ���õ� serviceNum
	 */
	public void setServiceNum(int serviceNum) {
		this.serviceNum = serviceNum;
	}
	
}
