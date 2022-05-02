package com.bridgelabz.Day_11;

import java.util.Scanner;

public class StockAccManagement_1 {
	public int Stocks() {
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int totalPrice = 0;
		System.out.print("Enter the number of Share : ");
		int numOfShare = scan1.nextInt();
		for (int i=1; i<=numOfShare; i++) {
			System.out.print("Enter the Share Price : ");
			int price = scan1.nextInt();
			totalPrice += price;
		}
		System.out.println("Total Stock Price of is "+ totalPrice);
		return totalPrice;
	}
	public void TotalStockValue(int totalPrice) {
		int TotalValue = 0;
		TotalValue+=totalPrice;
		System.out.println("Total Stock value is : "+TotalValue);
	}
	public static void main(String[] args) {
		StockAccManagement_1 Reliance = new StockAccManagement_1();
		StockAccManagement_1 IRCTC = new StockAccManagement_1();
		StockAccManagement_1 Total= new StockAccManagement_1();
		Reliance.Stocks();
		IRCTC.Stocks();
		
	}
}
