package com.jap.calculator;

public class MathematicalCalculator {

	public double add(double a, double b)
	{
		double res=0;
		try
		{
			res= a+b;
		}
		catch (Exception object)
		{
			object.printStackTrace();
			System.out.println("Refer the logs for more info");
		}
		return res;
	}
	public double subtract(double a, double b)
	{
		double res=0;
		try
		{
			res= a-b;
		}
		catch (Exception object)
		{
			object.printStackTrace();
			System.out.println("Refer the logs for more info");
		}
		return res;
	}
	public double multiply(double a, double b)
	{
		double res=0;
		try
		{
			res= a*b;
		}
		catch (Exception object)
		{
			object.printStackTrace();
			System.out.println("Refer the logs for more info");
		}
		return res;
	}
	public int divide(int a, int b)
	{
		//handle exception scenario here
		int result=0;
		try
		{
			result = a/b;
		}
		catch(Exception object)
		{
			object.printStackTrace();
			System.out.println("Refer the logs for more info");
		}
		return result;
	}
	public double modulo(double a, double b)
	{
		double res=0;
		try
		{
			res = a%b;
		}
		catch(Exception object)
		{
			object.printStackTrace();
			System.out.println("Refer the logs for more info");
		}
		return res;
	}
}