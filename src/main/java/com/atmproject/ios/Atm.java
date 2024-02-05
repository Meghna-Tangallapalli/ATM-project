package com.atmproject.ios;

public class Atm {

	public IEPrinter printer;
	
	
	/*
	 * public Atm(IEPrinter printer) { super(); this.printer = printer; }
	 */


	public void setPrinter(IEPrinter printer) {
		this.printer = printer;
	}


	public String withdraw() {
		printer.print();
		return "successfully withdrawn";
		
	}
}
