import java.util.Scanner;

public class MultiplesOf15{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("enter number: ");
		int num = input.nextInt();
		
		int i= 1;
		
		while(i<= 15){
			System.out.println(i + " = " + num * i);
			i++;
		}
	}
}