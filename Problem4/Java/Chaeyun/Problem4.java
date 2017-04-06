/*
�տ������� ���� ���� �ڿ������� ���� ���� ����� ���� ���� ��Ī��(palindrome)��� �θ��ϴ�.
�� �ڸ� ���� ���� ���� �� �ִ� ��Ī�� �� ���� ū ���� 9009 (= 91 �� 99) �Դϴ�.
�� �ڸ� ���� ���� ���� �� �ִ� ���� ū ��Ī���� ���Դϱ�?
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
