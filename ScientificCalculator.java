package com.jap.calculator;

public class ScientificCalculator {


	public double cielOfANumber(float num) throws CalculatorException
	{
		double result=0;
		result=Math.ceil(num);

		if (result<=0)
		{
			throw new CalculatorException("Input should not be zero or negative");
		}
		return result;
	}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		double result=0;
		result=Math.floor(num);

		if (result<=0.0)
		{
			throw new CalculatorException("Input should not be zero or negative");
		}
		return result;
	}
	
    public long power(int n, int p) throws CalculatorException
	{
		long result=0;
		long mul=1;
		for(int i=0 ; i<p; i++)
		{
			mul=mul*n;
			result=mul;
		}
		if (result<=0 || p<=0)
		{
			throw new CalculatorException("The base and exponent should not be zero or negative");
		}
       return result;
    }
    
    public double squareRoot(int n) throws CalculatorException
    {
		double result=0;
		result=Math.sqrt(n);

		if (result<=0 || n<=0)
		{
			throw new CalculatorException("Input should not be zero or negative");
		}
    	return result;
    }
}
