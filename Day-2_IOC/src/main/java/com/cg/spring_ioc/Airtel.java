package com.cg.spring_ioc;

public class Airtel implements Sim
{

Airtel()
{
	System.out.println(" Airtel constructor called");
}

	
public void Calling() {
	System.out.println("Calling using jio sim");
	
}

public void data() {
	System.out.println("Data using jio sim");
	
}
}