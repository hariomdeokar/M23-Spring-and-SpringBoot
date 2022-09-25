package com.cg.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	

    //setter method
	@Autowired
	@Qualifier("Humanheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	

    //Default constructor
	public Human() {
		this.heart = heart;
		}

	//Achieving DI using constructor
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}


	public void pumping()
	{
		heart.pump();
		System.out.println("The name of animal is: "+heart.getNameofAnimal()+ " and no of heart is: "+heart.getNoofheart());
		
	}

}
