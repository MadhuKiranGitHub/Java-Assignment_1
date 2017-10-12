import java.util.Scanner;

public class reverseDigitsOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number ");
		int number=input.nextInt();
		int remainder=0,quotient=0,result=0;
		while(number!=0){
			remainder=number%10;
			quotient=number/10;
			number=quotient;
		
			result=result*10+remainder;
		}
		System.out.println("Reversed number= "+ result);
		
	}

}
