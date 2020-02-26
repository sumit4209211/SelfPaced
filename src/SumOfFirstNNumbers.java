public class SumOfFirstNNumbers {

   public int sum1(int num)
    {
        return (num*(num+1)/2);
    }
    int sum2(int n)
    {
      int sum=0;
        for (int i = 0; i <=n; i++) {
            sum=sum+i;
        }
        return sum;
    }
    int sum3(int n)
    {
       int sum=0;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        return sum;
    }
    int sum4(int arr[],int n)
    {
        int sum=0;
        if(n%2!=0){
            return 0;
        }
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    int linearSearch(int arr[],int n,int x)
    {
        for (int i = 0; i < n; i++) {
             if(arr[i]==x)
                 return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        SumOfFirstNNumbers sumOfFirstNNumbers = new SumOfFirstNNumbers();
        System.out.println(sumOfFirstNNumbers.sum1(3));
        System.out.println(sumOfFirstNNumbers.sum2(10));
        System.out.println(sumOfFirstNNumbers.sum3(10));
        System.out.println(sumOfFirstNNumbers.sum4(new int[] { 3, 4, 5 ,9},4));
        System.out.println(sumOfFirstNNumbers.linearSearch(new int[] { 3, 4, 5 ,9},4,3));
    }
}
