package eulerproject;

public class problem03 {
	public static long[] calPrimeNum(long input) {
		long arr[] = new long[20];
		int cnt = 0;
		long div = 2;
		long temp;
		long quota;
		
		while(true) {
			temp = input % div;
			
			if(temp == 0) {
				quota = input / div;
				input = quota;
				
//				System.out.println(div);
				arr[cnt++] = div;
			} else {
				div++;
			}
			
			if(input == 1)
				break;
		}
		
		return arr;
	}
	
	public static long calMaxNum(long arr[]) {
		long first = arr[0];
		long max;
		
		max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) 
				max = arr[i];
		}
		
//		System.out.println(max);		
		return max;
	}
	
	public static void main(String[] args) {
		long input = 600851475143L;
		
		// 소인수분해 
		long arr[] = calPrimeNum(input);
		long max = calMaxNum(arr);
		
		System.out.println(" " + max);
	}

}
