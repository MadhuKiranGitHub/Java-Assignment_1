import java.util.Scanner;

public class swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter 2 number");
		int number1=input.nextInt();
		//System.out.println("enter 2nd number");
		int number2=input.nextInt();
		
		//Swapping with third variable
		System.out.println("Swapping with third variable");
		System.out.println("Before Swapping: "+ "number1="+ number1+" and number2="+ number2);
		int temp=0;
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("After Swapping: "+ "number1="+ number1+" and number2="+ number2);
		
		System.out.println("-----------------------------------------------------");
		
		//Swapping without third variable
		System.out.println("Swapping without third variable");
		System.out.println("Before Swapping: "+ "number1="+ number1+" and number2="+ number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After Swapping: "+ "number1="+ number1+" and number2="+ number2);
				
	}

}
