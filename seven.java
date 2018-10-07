import java.util.ArrayList;

public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<Integer> primes = new ArrayList<Integer>();
		
		int temp = 0;
		int numOfPrimes = 0;
		
		boolean primeNum = false;
		
		while(numOfPrimes != 10001){
			temp++;
			
			for(int x = 2; x<= (temp/2); x++){
				primeNum = true;
				if(temp%x == 0 ){
					primeNum = false;	
				}
				if(primeNum){
					numOfPrimes++;
				}
				
			}
		}
		
		System.out.println(temp);
	}

}
