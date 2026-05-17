public class MinFlips {
     public static void main(String[] args) {

        String pwd = "100111";

        int result = solution(pwd);

        System.out.println("Minimum Flips: " + result);
    }

    // Implement this function
    public static int solution(String pwd) {

        int count=0;
        for(int i=0; i<pwd.length()-1; i=i+2)
        {
             if(pwd.charAt(i)!=pwd.charAt(i+1))
             {
                count++;
             }
        }

        return count;
    }
}
