package com.codingdojo.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc= new Calculator();
		calc.getOperandOne(5.0);
		calc.getOperandTwo(6.0);
		calc.getOperation("*");
		System.out.println(calc.getAnswer());
	}
}