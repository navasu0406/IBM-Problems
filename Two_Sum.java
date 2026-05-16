import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {

        int[] transactions = {4, 7, 11, 15};
        int target = 18;

        int[] result = twoSum(transactions, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            int key=target-arr[i];
            if(map.containsKey(key))
            {
                
                 
                 return new int[]{map.get(key),i};
            }
            map.put(arr[i],i);
        }

        return new int[]{-1, -1};
    }
}
