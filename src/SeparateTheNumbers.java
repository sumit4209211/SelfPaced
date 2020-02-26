public class SeparateTheNumbers {
  static void separateNumbers(String s){
      String subString="";
      boolean isvalid = false;
      for (int i = 0; i < s.length()/2; i++) {
          subString = s.substring(0, i);
          long num = Long.parseLong(subString);
          String validString = subString;
          while (validString.length() < s.length())
          {
              validString+=Long.toString(++num);
          }
         if(s.equals(validString)){
             isvalid=true;
             break;
         }
      }
      System.out.println(isvalid ? "YES" + subString : "NO");
  }
}
