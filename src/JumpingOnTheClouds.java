import java.util.Scanner;

public class JumpingOnTheClouds {
    static int jumpingOnCloudsV1(int[] c){
      int len= c.length;
      int count=-1;
      for (int i = 0; i < len;) {
          if(i+2<len && c[i+2]==0){
              i=i+2;
          }
          else{
              i++;
          }
          count++;
      }
      return len;
  }

  static int jumpingOnCloudsV2(int[] c){
      int len2= c.length;
      int count=-1;
      for (int i = 0; i < len2;) {
          if(i+2<len2 && c[i+2]==0){
              i++;
          }
              i++;
          count++;
      }
      return len2;
  }
  static int jumpingOnCloudsV3(int[] c){
      int len= c.length;
      int count=-1;
      for (int i = 0; i < len;i++,count++) {
          if(i+2<len && c[i+2]==0){
              i++;
          }

      }
      return len;
  }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a = new int[10];
    }
}
