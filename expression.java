public class expression {

  public static int getNumberOne() {
		int number1 = getNumber();
		return number1;
	}
	
	public static int getNumberTwo() {
		int number2 = getNumber();
		return number2;
	}
	
	static int getNumber() {
		
		int a = (int) Math.round(Math.random()*10);
		return a;
		
	}
	
	public static char getOperator() {
		char operator = assignOperator();
		return operator;
	}
	
	static char assignOperator() {
		
		char mysteryOperator;
		char[] operators = {'+', '-', '*'};
	
		double decidingFactor = Math.random();
	
		if (decidingFactor < (1.0/3)) {
			
			mysteryOperator = operators[0];
			return mysteryOperator;
		}
		
		else if (decidingFactor < 2.0/3) {
			
			mysteryOperator = operators[1];
			return mysteryOperator;
		}
		
		else {
			
			mysteryOperator = operators[2];
			return mysteryOperator;
		}
	}//end getOperators
}
