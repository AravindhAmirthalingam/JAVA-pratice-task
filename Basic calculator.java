import java.util.Scanner;
public class Caculater {

	public static void main(String[] args) {
		//simple calculator
		Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number: ");
        double firstnumber= scanner.nextDouble();
        
        System.out.println("enter second number:");
        double secondnumber= scanner.nextDouble();
        
        double  result= firstnumber +  secondnumber;
        System.out.println("sum of this number is:"  + result);
	}

}
