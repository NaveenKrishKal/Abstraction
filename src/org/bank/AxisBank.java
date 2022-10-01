package org.bank;

public class AxisBank extends BankInfo{

	@Override
	public void deposit() {
System.out.println("5 years RD is 2%");		
	}
public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.savig();
	a.fixed();
	a.deposit();
}
}
