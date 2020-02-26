import java.util.Scanner;

public class CommonChildSolution {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();
        int result=commonChild(s1,s2);
    }

    private static int commonChild(String s1, String s2) {
        return LongestCommonSubsequence.LCSM4(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length());
    }
}
