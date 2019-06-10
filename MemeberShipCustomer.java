package com.pennant.hotel;

public class MemeberShipCustomer extends Hotel {

	private String name;
	private double discount;
	private int quantity;

	public MemeberShipCustomer() {
	}

	public MemeberShipCustomer(String item, double costForItem, String name, double discount, int quantity) {
		super(item, costForItem);
		this.name = name;
		this.discount = discount;
		this.quantity = quantity;
	}
	private double bill = 0;
	@Override
	public double generateBill() {
		 bill = (super.getCostForItem() - discount) * quantity;
		return bill;
	}
	
	@Override
	public void display() {
		System.out.println("Name :" + name);
		System.out.println("Ordered iteams " + super.getItem());
		System.out.println("Quantity " + quantity);
		System.out.println("Total Bill " + bill);
		System.out.println("=============");		
	}

}
