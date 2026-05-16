

public class Diagonal_Sums {
    public static void main(String[] args) {
        int [] [] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(sum(arr));
    }

    public static int sum(int [] [] arr)
    {
        int sum=0;
        int n=arr.length;
        //Primary diagonal
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i][i];
            if(i!=n-1-i)
            {
                sum+=arr[i][n-i-1];
            }
        }

        return sum;
    }
}
