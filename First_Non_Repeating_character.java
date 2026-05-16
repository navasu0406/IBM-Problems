public class First_Non_Repeating_character {
    public static void main(String[] args) {
        String s="aabbcddeff";
        System.out.println(solution(s));
    }

    public static char solution(String s)
    {
        int [] arr=new int[256];

        for(int i=0; i<s.length(); i++)
        {
            arr[s.charAt(i)]++;
        }

        for(int i=0; i<s.length(); i++)
        {
            if(arr[s.charAt(i)]==1)
            {
                return s.charAt(i);
            }
        }
        return '#';
    }
}
