/*
앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
*/
public class Problem4 {
	public static void main(String args[]) {
		int maxSmtnum = 0;
		for(int i = 100; i < 1000; i++){
			for(int j = 100; j < 1000; j++){
				if(chkSmt(i * j) && maxSmtnum < i * j){
					maxSmtnum = i * j;
				}
			}
		}
		System.out.println(maxSmtnum);
	}
	
	public static boolean chkSmt(int num) {
		boolean smtYN = false;
		String numStr = String.valueOf(num);
		if(Integer.parseInt(numStr) == Integer.parseInt(reverseString(numStr)))
			smtYN = true;
		return smtYN;
	}
	
	public static String reverseString(String str){
		return (new StringBuffer(str)).reverse().toString(); 
	}
}
