
package com.pennant.hotel;

public class Test {

	public static void main(String[] args) {
		Hotel hotel[] = new Hotel[9];
		hotel[0] = new RegularCustomer("puri", 50, "Diwakar", 10, 2);
		hotel[1] = new RegularCustomer("dosa", 35, "rohith", 10, 1);
		hotel[2] = new RegularCustomer("idly", 30, "chandu", 10, 2);
		hotel[3] = new MemeberShipCustomer("Idly", 35, "VArun", 7, 4);
		hotel[4] = new MemeberShipCustomer("Chapathi", 35, "ram", 12, 2);
		hotel[5] = new MemeberShipCustomer("Idly", 35, "sirish", 7, 2);
		hotel[6] = new NormalCustomer("Puri", 50, "Rupesh", 0, 2);
		hotel[7] = new NormalCustomer("Vada", 40, "Ravi", 0, 2);
		hotel[8] = new NormalCustomer("Special Dosa", 50, "Hari", 0, 1);
		double turnOver = 0;
		for (int i = 0; i < hotel.length; i++) {
			double bill = hotel[i].generateBill();
			hotel[i].display();
			turnOver = turnOver + bill;
		}
		System.out.println("Total TurnOver :" + turnOver);

	}

}
