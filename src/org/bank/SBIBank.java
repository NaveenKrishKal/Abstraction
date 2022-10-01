package org.bank;

public class SBIBank extends BankInfo{
	
	@Override
	public void deposit() {
		System.out.println("1 years RD is 2%");
	}	
	public static void main(String[] args) {

		SBIBank s = new SBIBank();
		s.savig();
		s.fixed();
		s.deposit();
		
	}
}
