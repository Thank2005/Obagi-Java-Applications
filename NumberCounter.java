import java.util.Scanner;

public class NumberCounter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int positive = 0; 
		int negative = 0;
		int zero = 0;
		
		for(int i = 1; i <= 10; i++){
			System.out.print("Enter an integer: ");
			int num = input.nextInt();
			
			if(num> 0){
				positive++;	
			}
			else if(num<0){
			}
			else{
				zero++;
			}
		}
		System.out.printf("the number of possitive integer is %d%n",positive);
		System.out.printf("the number of negative integer is %d%n",negative);
		System.out.printf("the number of zero integer is %d%n",zero);
	}
}