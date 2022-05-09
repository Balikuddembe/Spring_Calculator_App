package beans.arithmeticoperations;

public class BasicArithmeticOperations {
	private double num1;
	private double num2;
	
	
	public BasicArithmeticOperations() {
		super();
		
	}
	//parametised constructor
	public BasicArithmeticOperations(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	//setters and getters
	public double getNum1() {
		
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	
	
	//methods
	
	public double add() {
		return num1+num2;
		
	}
	public double subtract() {
		return num1-num2;
			
		}
	public double multiply() {
		return num1*num2;
		
	}
	public double divide() {
		return num1/num2;
		
	}
	@Override
	public String toString() {
		return "BasicArithmeticOperations [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
}
