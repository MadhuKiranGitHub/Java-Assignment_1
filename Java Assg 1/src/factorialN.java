import java.util.Scanner;

public class factorialN {
	
	/*  Using recursive method
	public static int findFactorial(int fact){
		
		if(fact == 0 || fact == 1){
			return 1;
		}
		return (fact*findFactorial(fact-1));
	}
	 */
	
	///Using iterative method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter value of n");
		int number=input.nextInt();
		int fact=1;
		// Use below 2 lines for recursive method.
		//		int factorial=findFactorial(number);
		//			System.out.println(factorial);
		if(number == 0 ){
			fact=1;
		}
		else{
			for(int i=1;i<=number;i++){
				fact=fact*i;
			}
		}
		
		System.out.println("factorial="+fact);
		
	}

}
