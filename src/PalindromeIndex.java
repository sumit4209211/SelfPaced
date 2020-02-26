public class PalindromeIndex {
  static int palindromeIndex(String s){
      int palindromeIndex=-1;
      int len = s.length();
      for (int i = 0; i < len/2; i++) {
          if(s.charAt(i)!=s.charAt(len-i-1)){
              if (i+1<len){
                  boolean isRight=isValidPalindrome(s.substring(i+1,len-i));
                  if(isRight)
                      return i;
                  return len-i-1;
              }
          }
      }
      return palindromeIndex;
  }

    private static boolean isValidPalindrome(String substring) {
        int len = substring.length();
        for (int i = 0; i < len / 2; i++) {
            if (substring.charAt(i) != substring.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
