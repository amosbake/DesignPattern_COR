package com.bdqn.pattern.cor.handler;
/**
 * �۸�����,�������û����ۿ�����
 * @author mopel
 *
 */
public abstract class PriceHandler {
	protected PriceHandler successor;
	
	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	/**
	 * �����ۿ�����
	 * @param discount
	 */
	public abstract void processDiscount(float discount);
	
}
