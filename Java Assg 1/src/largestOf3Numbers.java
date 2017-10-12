import java.util.Scanner;

public class largestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter 3 numbers ");
		int value1=input.nextInt();
		int value2=input.nextInt();
		int value3=input.nextInt();
		
		if(value1==value2 && value2==value3){
			System.out.println("all values are equal");
		}
		else{
			
			if(value1>value2 && value1>value3){
				System.out.println( value1 + " is largest number");
			}
			else if(value2>value3){
					System.out.println( value2 + " is largest number");
			}
			else{
				System.out.println(value3 + " is largest number");
			}
		}
		

	}

}
