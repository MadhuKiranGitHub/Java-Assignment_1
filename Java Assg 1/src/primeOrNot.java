import java.util.Scanner;

public class primeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number ");
		int number=input.nextInt();
		int flag=0;
		for(int i=2;i*i<=number;i++){
			if(number%i==0){
				flag=1;
			}
		}
		if(flag==1){
			System.out.println("not prime");
		}
		else{
			System.out.println("prime");
		}
		
	}

}
