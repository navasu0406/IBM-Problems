//Given a string: a2b3a1c2b2
//Each character is followed by its frequency.
//Your task:
//Add frequencies of same characters
//Print final compressed string in alphabetical order
//output:a3b3c1d7e6
class StringCompression
{
    public static void main(String[] args) {
        String s="a2e5a1b3d6e1d1c1";
        System.out.println(solution(s));
    }

    public static String solution(String s)
    {
        int [] arr=new int[256];

        for(int i=0; i<s.length(); i=i+2)
        {
            arr[s.charAt(i)]=arr[s.charAt(i)]+(s.charAt(i+1))-'0';
        }

        String result="";
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0)
            {
                result=result+(char)i+arr[i];
            }
        }
        return result;
    }
}