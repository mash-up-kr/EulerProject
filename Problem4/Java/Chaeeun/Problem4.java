/**
 * @auther Lee, Chae Eun
 * @since 2017-03-25
 */


public class Problem4 {
    public static void main(String[] args) {
        int digit = 3;
        int answer = getPalindrome(digit);
        System.out.println("The largest palindrome is " + answer);
    }

    public static int getPalindrome(int digit) {
        int maxPalindrome = 0;
        for (int i = 999; i > 99 ; i--) {
            for (int j = 999; j > 99 ; j--) {
                int mainNumber = i * j;
                boolean isPalindrome = checkPalindrome(mainNumber);
                if (isPalindrome && (mainNumber > maxPalindrome)) {
                    maxPalindrome = mainNumber;
                }
            }
        }
        return maxPalindrome;
    }

    private static boolean checkPalindrome(int mainNumInteger) {
        String mainNum = String.valueOf(mainNumInteger);
        int len = mainNum.length();

        for (int i = 0; i < len / 2; i++) {
            char ch1 = mainNum.charAt(i);
            char ch2 = mainNum.charAt(len - (i + 1));
            if (ch1 == ch2) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}

