import java.util.Scanner;
public class Calculatorusingswitch {

	public static void main(String[] args) {
	char operator;
	double number1 ,number2, number3, result;
     
	Scanner input= new Scanner(System.in);
	
	System.out.println("choose the operator: +,-,*,or /");
	operator = input.next().charAt(0);
	
	System.out.println("enter first number");
	number1 = input.nextDouble();
	
	System.out.println("enter the second number");
	number2 = input.nextDouble();
	
	System.out.println("enter the third number");
	number3 = input.nextDouble();
	
	switch(operator) {
	
	case '+' :
		result = number1 + number2 + number3;
		System.out.println(number1 +"+" +number2+"+"+number3 +"=" + result);
		break;
	
	case '-' :
		result= number1 - number2 - number3;
		System.out.println(number1+ "-" + number2+"-"+number3+ "="+ result);
		break;
		
	case '*':
		result= number1 * number2 * number3;
		System.out.println(number1+ "*"+ number2+"*"+number3+ "="+result);
		break;
		
	case '/':
		result= number1 / number2 / number3;
		System.out.println(number1+"/"+number2+"/"+number3+"="+result);
		break;
		
	default :
		System.out.println("invalid operator");
		break;
	}
	input.close();
	}

}
