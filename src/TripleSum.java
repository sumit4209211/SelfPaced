import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TripleSum {
 static long triplets(int[] a, int[] b, int[] c){
     long distinctTriplet=0;
     int[] distinctA=removeDuplicates(a);
     int[] distinctB=removeDuplicates(b);
     int[] distinctC=removeDuplicates(c);
     Arrays.sort(distinctA);
     Arrays.sort(distinctB);
     Arrays.sort(distinctC);
     for (int q:
          distinctB) {
         long c1=getValidIndex(distinctA,q)+1;
         long c3=getValidIndex(distinctC,q)+1;
         distinctTriplet+=c1*c3;
     }
     return distinctTriplet;
 }

    private static long getValidIndex(int[] distinctA, int key) {
        int low = 0;
        int high = distinctA.length - 1;
        int count = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(distinctA[mid]<=key){
                count=mid;
                low=mid+1;
            }else
                high=mid-1;
        }
        return count;
    }
    private static int[] removeDuplicates(int[] a) {
        Set<Integer> set=new HashSet<>();
        for (int item:
             a) {
            set.add(item);
        }
        int len=set.size();
        int[] result=new int[len];
        int i=0;
        for (int item:
             set) {
            result[i++]=item;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int lena = scanner.nextInt();
        int lenb = scanner.nextInt();
        int lenc = scanner.nextInt();

        int a[] = new int[lena];
        int b[] = new int[lenb];
        int c[] = new int[lenc];
        for (int i = 0; i <lena ; i++) {
               a[i]=scanner.nextInt();
        }
    }
}
