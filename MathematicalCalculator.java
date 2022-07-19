package com.jap.calculator;

public class MathematicalCalculator {

	public double add(double a, double b)
	{	
		return a+b;
	}
	public double subtract(double a, double b)
	{	
		return a-b;
	}
	public double multiply(double a, double b)
	{	
		return a*b;
	}
	public int divide(int a, int b)
	{
		//handle exception scenario here
		if (b==0)
		{
			return 0;
		}
		else
		{
			return a/b;
		}
	}
	public double modulo(double a, double b)
	{
		double res=0;
		if (b==0)
		{
			res=0;
		}
		return res;
	}
}
