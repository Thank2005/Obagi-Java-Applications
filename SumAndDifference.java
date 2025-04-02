import java.util.Scanner;

public class SumAndDifference{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int sumOf6_9 = 0;
		int sumOf4_10 = 0;
		int difference;
		
		for(int i = 1; i<= 10; i++){
			System.out.printf("Enter num%d: ",i);
			int num = input.nextInt();
			
			if(i >= 6 && i <= 9){
				sumOf6_9 += num;
			}
			if(i >= 4 && i <= 10){
				sumOf4_10 += num;
			}
		}
	    difference = sumOf4_10 - sumOf6_9;
		 
		System.out.printf("the difference is %d",difference);
 }
}