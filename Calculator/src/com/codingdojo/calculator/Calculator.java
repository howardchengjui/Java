package com.codingdojo.calculator;

public class Calculator {
		private double OperandOne;
		private double OperandTwo;
		private String Operation;
		
		public double getAnswer() {
			if(Operation.equals("+")) {
				return OperandOne + OperandTwo;
				
			}else {
				return OperandOne - OperandTwo;
			}
		}
			
		public double getOperandOne(double first) {
			return this.OperandOne = first;
		}
		
		public double getOperandTwo(double second) {
			return this.OperandTwo = second;	
		}
		
		public String getOperation( String op) {
			return this.Operation = op ;
		}
		
}

