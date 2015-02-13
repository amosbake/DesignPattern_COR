package com.bdqn.pattern.cor;

import java.util.Random;

import com.bdqn.pattern.cor.handler.PriceHandler;
import com.bdqn.pattern.cor.handler.PriceHandlerFactory;

/**
 *øÕªß,…Í«Î’€ø€
 * @author mopel
 *
 */
public class Customer {
	
	private PriceHandler priceHandler;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(PriceHandler priceHandler) {
		super();
		this.priceHandler = priceHandler;
	}
	
	

	public PriceHandler getPriceHandler() {
		return priceHandler;
	}

	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	public void requestDiscount(float discount){
		priceHandler.processDiscount(discount);
	}
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setPriceHandler(PriceHandlerFactory.createHandler());
		
		Random rand=new Random();
		for(int i=0;i<100;i++){
			System.out.print(i+":");
			customer.requestDiscount(rand.nextFloat());
		}
		
	}
}
