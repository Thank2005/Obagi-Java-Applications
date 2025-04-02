public class PrintMethod{
    public static void main(String[] args) {
	        System.out.print("\"Learning java is fun,\"\n");
	        System.out.print(" hey, come learn java with Me");
	  
	  //using the printin
	        System.out.println();
	        System.out.println("Java Learning is fun");
			System.out.println("\t start a new paragraph here");
			
			// printf() goes with format specifiers %s string, d decimal, %f floating point(0.3,5.),%.nf
			System.out.printf("My name is chuks and i love is. Good day everyone","java");
			System.out.printf("i am %d year old%n",25); //print the whole number 25
			System.out.printf("i bought java JDK with %f naira%n",159.345);
			System.out.printf("i bought java JDK with %c%.2f %n",'$',159.345); //%.2f change the float to 2 decimal place
			
			//character in'$,%,&' while string is in "Name"
			
			boolean isJavaFun = true;
			System.out.printf("is java fun? %b",isJavaFun);
	}
}
	
	  
	  