public class Valid_Anagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        System.out.println(solution(s1, s2));
    }

    public static boolean solution(String s1, String s2)
    {
        if(s1.length()!=s2.length())return false;
         int [] arr=new int[256];

         for(int i=0; i<s1.length(); i++){
 
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
         }

         for(int i=0; i<arr.length; i++)
         {
            if(arr[i]!=0)
                return false;
         }

         return true;
    }
}
