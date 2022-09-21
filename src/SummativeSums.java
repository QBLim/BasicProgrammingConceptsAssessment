
public class SummativeSums {
	
	static int arraySum1(int sum) {		
		int[] arr = {1, 90, -33, -55, 67, -16, 28, -55, 15};
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
		
	static int arraySum2(int sum) {			
		int[] arr = {999, -60, -77, 14, 160, 301};
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}		
		
	static int arraySum3(int sum) {			
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 
					120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	} 	
	
	public static void main(String[] args) {
				
		System.out.println("#1 Array Sum: " + arraySum1(0));
		System.out.println("#2 Array Sum: " + arraySum2(0));
		System.out.println("#3 Array Sum: " + arraySum3(0));
	}

}
