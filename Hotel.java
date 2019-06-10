package com.pennant.hotel;

public abstract class Hotel {

	private String item;
	private double costForItem;

	public Hotel() {
	}

	public Hotel(String item, double costForItem) {
		super();
		this.item = item;
		this.costForItem = costForItem;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getCostForItem() {
		return costForItem;
	}

	public void setCostForItem(double costForItem) {
		this.costForItem = costForItem;
	}

	public abstract double generateBill();

	public abstract void display();

}
