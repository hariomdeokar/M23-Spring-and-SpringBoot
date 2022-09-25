package com.cg.springaw;

public class Heart {
	
	private String nameofAnimal;
	private int noofheart;
	
	public void pump()
	{
		System.out.println("Your heart is pumping and you are alive");
	}

	public String getNameofAnimal() {
		return nameofAnimal;
	}

	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}

	public int getNoofheart() {
		return noofheart;
	}

	public void setNoofheart(int noofheart) {
		this.noofheart = noofheart;
	}


	

}
