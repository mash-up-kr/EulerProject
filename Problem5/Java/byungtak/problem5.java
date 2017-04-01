package eulerproject;

public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int cnt = 1;
		
		while(true) {
			flag = validateNumOfMod(cnt);
			
			if(flag == true) 
				break;
			
			cnt++;
		}
		
		System.out.println(cnt);
	}

	private static boolean validateNumOfMod(int cnt) {
		for(int i=1; i<=20; i++) {
			if(cnt%i != 0)
				return false;
		}
		
		return true;
	}

}
