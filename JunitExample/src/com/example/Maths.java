package com.example;

public class Maths {

	public int add(int a,int b)
	{
		return a+b;
	}
	
	
	public int square(int a)
	{
		if(a<0)
		{
			throw new IllegalArgumentException();
		}
		return a*a;
	}

}
