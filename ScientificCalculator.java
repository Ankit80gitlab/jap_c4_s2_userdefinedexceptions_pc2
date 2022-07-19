package com.jap.calculator;

public class ScientificCalculator {


	public double cielOfANumber(float num) throws CalculatorException
	{
		double result=0;

		if (num<=0.0)
		{
			throw new CalculatorException("Input should not be zero or negative");
		}
		else
		{
			result=Math.ceil(num);
		}
		return result;
	}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		double result=0;

		if (num<=0.0)
		{
			throw new CalculatorException("Input should not be zero or negative");
		}
		else
		{
			result=Math.floor(num);
		}
		return result;
	}
	
    public long power(int n, int p) throws CalculatorException {

		long result=0;
		long mul=1;

		if ((n<=0)||(p<=0))
		{
			throw new CalculatorException("The base and exponent should not be zero or negative");
		}
		else
		{
			for(int i=0 ; i<p; i++)
			{
				mul=mul*n;
				result=mul;
			}
		}
       return result;
    }
    
    public double squareRoot(int n) throws CalculatorException
    {
		double result=0;

		if (n<=0)
		{
			throw new CalculatorException("Input should not be zero or negative");
		}
		else
		{
			result=Math.sqrt(n);
		}
    	return result;
    }
}
