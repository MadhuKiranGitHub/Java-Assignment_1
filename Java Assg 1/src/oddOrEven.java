import java.util.Scanner;

public class oddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		int number=input.nextInt();
		//checking for invalid condition., if number is negative
		if(number<0){
			System.out.println("Invalid input");
		}
		else{
			if(number%2==0){
				System.out.println(number + " is even");
			}
			else{
				System.out.println(number + " is odd");
			}
		}
		
	}

}
