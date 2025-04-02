import java.util.Scanner;


public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter gender (M/F): ")
		char gender = input.next().charAt(0);
		
		input.nextline();
		
		System.out.print("Enter your address: ");
		String address = input.nextLine();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.println("Enter your balance");
		double balance = input.nextDouble();
		
		System.out.print("Do you love Java?(True/False): ");
		boolean isJava = input.nextBoolean();
		
		System.out.printIn();
		System.out.printf("Hello %s, You are welcome to Firstbank %n",name);
		System.out.printf("You are leaving in %s%/n",address);
		System.out.printf("you age %d years old",age);
		System.out.printf("your account balance is %c%.2f%n",'$',balance);
		System.out.printf("%s,Do you love Java %b",name,isJava);
		
	}
	
	
}