import java.util.HashMap;

public class Minimum_Moves_to_Reduce_String {
       public static void main(String[] args) {

        String word = "basbacar";

        int result = minMoves(word);

        System.out.println(result);
    }

    public static int minMoves(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int moves=0;
        for(int n:map.values())
        {
           moves+=n/2;
        }
        return moves;
    }
}
