package com.bdqn.pattern.cor.handler;

public class PriceHandlerFactory {

	/**
	 * 创建PriceHandler的工厂方法
	 * @return
	 */
	public static PriceHandler createHandler() {
		
		
		PriceHandler sales=new Sales();
		PriceHandler lead=new Lead();
		PriceHandler manager=new Manager();
		PriceHandler dir=new Director();
		PriceHandler vp=new VicePresident();
		PriceHandler ceo=new CEO();
		
		
		sales.successor=lead;
		lead.successor=manager;
		manager.successor=dir;
		dir.successor=vp;
		vp.successor=ceo;
		
		return sales;
	}

}
