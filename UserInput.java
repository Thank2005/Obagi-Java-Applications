import java.util.Scanner;


public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your address: ");
		String address = input.nextLine();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.println();
		
		System.out.printf("Hello %s, You are welcome to Firstbank %n",name);
		System.out.printf("You are leaving in %s%n",address);
		System.out.printf("you age %d years old",age);
	}
	
	
}