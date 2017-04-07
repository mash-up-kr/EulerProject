package eulerproject;

public class problem4 {
	public static void main(String[] args) {
		int temp = 0;
		int max = 0;
		
		for(int i=999; i>=100; i--) {
			for(int j=999; j>=100; j--) {
				if(palindrome(i, j) == true) {
					temp = i*j;
					if(max < temp) {
						max = temp;
					}
				}
			}
		}
		System.out.println(max);
	}

	private static boolean palindrome(int i, int j) {
		String mulStr = String.valueOf(i*j);
		
		char[] mulChar = new char[mulStr.length()];
		mulChar = mulStr.toCharArray();
		
		int len = mulChar.length;
		
		if(len > 3) {
			for(int k=0; k<len/2; k++) 
				if(mulChar[k] != mulChar[len-k-1]) 
					return false;
		} else {
			return false;
		}

		return true;
	}
}
