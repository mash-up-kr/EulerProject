package problem4;

public class problem4 {
	public static int isPalindrome(int num){
		int reverse_num = 0;
		int target_num = num;
		int digit_num = 10;
		while(target_num>0){
			reverse_num = (reverse_num * 10) + (target_num % digit_num);
			target_num = target_num/digit_num;
		}
		if(num == reverse_num)
			return num;
		else
			return 0;
	}
	
	public static void main(String[] args){
		int num1 = 999;
		int num2 = 999;
		int num3 = 0;
		int check = 0;
		int answer = 0;
		
		for(num1=999; num1>=num3; num1--){
			for(num2=999; num2>0; num2--){
				check = isPalindrome(num1 * num2);
				if(check != 0) {
					if(check>answer)
						answer=check;
					num3 = num2;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
