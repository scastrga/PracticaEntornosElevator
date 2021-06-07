package com.everis.elevator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		CentralControlSystem ccs1 = new CentralControlSystem();

		ccs1.eButton.push();
		ccs1.iButton.pushButton(10);
		ccs1.selectDirection(5);
	}
}
