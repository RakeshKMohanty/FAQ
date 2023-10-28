public class Longestplindrome {

    public static void main(String[] args) {
        String input = "ac";
        System.out.println("Longest Pallindrome : " + longestPalindrome(input));
    }
    public static String longestPalindrome(String s) {
        String longestPallindrome = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            int nextIndexOfChar = s.indexOf(s.charAt(i), i + 1);
            if (nextIndexOfChar != -1 && checkPallindrome(s.substring(i, nextIndexOfChar + 1))) {
                String substring = s.substring(i, nextIndexOfChar + 1);
                if (substring.length() > longestPallindrome.length()) {
                    longestPallindrome = substring;
                }
            }
        }
        //return longestPallindrome;

        if(s.length()>2 && s.length()%2 !=0)
        {
            int mid = s.length()/2;
            String pallindrome = "";
            for(int i=mid-1,j=mid+1; i>=0&&j<=s.length()-1; i--,j++){

                if(s.charAt(i) != s.charAt(j) && longestPallindrome.length()<pallindrome.length()){
                    longestPallindrome = pallindrome;
                    return longestPallindrome;
                }
                //pallindrome = pallindrome+
            }

        }
        return longestPallindrome;
    }

    private static boolean checkPallindrome(String substring) {
        for (int i = 0, j = substring.length() - 1; j > i; i++, j--) {
            if (substring.charAt(i) != substring.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
