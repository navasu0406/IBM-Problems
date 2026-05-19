/*
Question:
Given request ids as an array of strings requests and an integer k,
find the k most recent distinct requests.

The answer should be returned in order from most recent to least recent.

Example:
Input:
requests = ["item1", "item2", "item3", "item1", "item3"]
k = 3

Traversal from right to left:
item3 -> take
item1 -> take
item3 -> already taken, skip
item2 -> take

Output:
["item3", "item1", "item2"]
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Latest_k_requests {
    public static void main(String[] args) {

        String[] requests = {
            "item1",
            "item2",
            "item3",
            "item1",
            "item3"
        };

        int k = 3;

        List<String> result = getLatestKRequests(requests, k);

        System.out.println(result);
    }

    public static List<String> getLatestKRequests(String[] requests, int k) {

        HashSet<String> set=new HashSet<>();
        ArrayList<String> list=new ArrayList<>();

        int i=requests.length-1;; 
        while(k>=0 && i>=0)
        {
             if(!set.contains(requests[i]))
             {
                list.add(requests[i]);
                k--;
             }
             set.add(requests[i]);
             i--;
        }

        return list;
    }
}
