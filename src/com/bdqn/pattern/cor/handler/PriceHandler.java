package com.bdqn.pattern.cor.handler;
/**
 * 价格处理人,负责处理用户的折扣申请
 * @author mopel
 *
 */
public abstract class PriceHandler {
	protected PriceHandler successor;
	
	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	/**
	 * 处理折扣申请
	 * @param discount
	 */
	public abstract void processDiscount(float discount);
	
}
