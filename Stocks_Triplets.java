import java.util.Arrays;

public class Stocks_Triplets {
     public static void main(String[] args) {

        int[] arr = {3, 3, 4, 7, 8};
        int d = 5;

        int result = solution(arr, d);

        System.out.println("Number of Triplets: " + result);
    }

    // Implement this function
    public static int solution(int[] arr, int d) {

        int count=0;

        for(int i=0; i<arr.length-2; i++)
        {
            for(int j=i+1; j<arr.length-1; j++)
            {
                for(int k=j+1; k<arr.length; k++)
                {
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum%d==0)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
