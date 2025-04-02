import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# To Subscribe Data");
		System.out.println("Enter *310# To Check Balance");
		System.out.println("Enter *303# TO Borrow Data");
		
		System.out.print("Enter code: ");
		String option = input.nextLine();
		
		switch(option){
			case "*131#":
	        {
				System.out.println("Enter 1 for 1 Month Plan");
				System.out.println("Enter 2 for 2 Month Plan");
				System.out.println("Enter 3 for 3 Month Plan");
				System.out.println("Enter 4 for 4 Month Plan");
				System.out.println("");
				
				System.out.print("Enter code: ");
				int code = input.nextInt();
				switch(code){
					case 1:
					{
						System.out.println("your 1 month subscription has be activated");	    
					}
					break;
					
					case 2:
					{
						System.out.println("your 2 month subscription has be activated");
					}
					break;
					
					case 3:
					{
						System.out.println("your 3 month subscription has be activated");
					}
					break;
					
					case 4:
					{
						System.out.println("your 4 month subscription has be activated");
					}
					break;
					default:
					System.out.println("invalid input");
				}
					
					
			}
			break;
			
			case"*310#":
		    {
				System.out.println("your balance is N782.97");
			}
			break;
			
		    case"*303#":
			{
				System.out.println("Enter 1 to borrow 1000");
				System.out.println("Enter 1 to borrow 2500");
				System.out.println("Enter 1 to borrow 4500");
				System.out.println("Enter 1 to borrow 7000");
				
				System.out.print("Enter code: ");
				int code = input.nextInt();
				
				switch (code){
					case 1:
					{
						System.out.println("your account has been credited with 1000");
					}
					break;
					
					case 2:
					{
						System.out.println("your account has been credited with 2500");
					}
					break;
					
					case 3:
					{
						System.out.println("your account has been credited with 4500");
					}
					break;
					
					case 4:
					{
						System.out.println("your account has been credited with 7000");
					}
					break;
					
					default:
					System.out.println("invalid code");
				}
			}
			break;
			
			default:
			System.out.println("invalid input");
		}
    }
}
	