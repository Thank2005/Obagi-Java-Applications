public class IterationOfNumbers{
	public static void main(String[] args){
		
		for (int i = 1; i<= 20; i++){
			if(i == 2){
				continue;	
			}if(i == 5){
				continue;	
			}
			if(i == 9){
				continue;	
			}
			if(i == 13){
				continue;	
			}
			if(i == 19){
				continue;	
			}
			
		    System.out.printf("%d%n",i);
		}

    }
}