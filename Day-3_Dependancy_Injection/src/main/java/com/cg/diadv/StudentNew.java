package com.cg.diadv;
//Dependency in terms of object
//Student class is dependent on math cheat class
public class StudentNew 
{
	MathCheat math;
	public void cheating()
	{
		math.mathCheat();
	}
	
	//DI using Setters
	public void setMath(MathCheat math) {
		this.math = math;
	}

}  
