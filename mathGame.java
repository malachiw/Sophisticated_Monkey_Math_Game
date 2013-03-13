

public class mathGame {
  
	static int number1 = expression.getNumberOne();
	static int number2 = expression.getNumberTwo();
	static char operator = expression.getOperator();
		
	public static boolean mathGameMonkey(Integer number) {
		int userAnswer = number;
		boolean wereTheyRight;
		
		wereTheyRight = evaluateAnswer(number1, number2, userAnswer, operator);
		
		return wereTheyRight;		
	}
	
		
	static int getNumber() {
		
		int a = (int) Math.round(Math.random()*10);
		return a;
		
	}
	
	
	
	static boolean evaluateAnswer(int number1, int number2, int userAnswer, char operator) {
		
		boolean userIsRight = false;
		
		if (operator == '+') {
			if (userAnswer == number1 + number2){
				
				userIsRight = true;
											
			}
		}
		
		else if (operator == '-') {
			if (userAnswer == number1 - number2){
				
				userIsRight = true;
											
			}
		}
		else if (operator == '*') {
			if (userAnswer == number1 * number2){
				
				userIsRight = true;
											
			}
		}
		else {
			
			return userIsRight;
		}
		
		return userIsRight;
	}//end evaluateAnswer

}
