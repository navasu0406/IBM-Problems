import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_sum {
     public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = solution(arr);

        System.out.println(result);
    }

    public static List<List<Integer>> solution(int[] arr) {

       Set<List<Integer>> result=new HashSet<>();
       Arrays.sort(arr);
       for(int i=0; i<arr.length-2; i++)
       {
            int start=i+1;
            int end=arr.length-1;

            while(start<end)
            {
                 int sum=arr[i]+arr[start]+arr[end];

                 if(sum==0)
                 {
                    result.add(Arrays.asList(arr[i],arr[start],arr[end]));
                    start++;
                    end--;
                 }
                 else if(sum<0)
                 {
                    start++;
                 }
                 else{
                    end--;
                 }
            }
       }
       return new ArrayList<>(result);
    }
}
