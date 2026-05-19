import java.util.ArrayList;
import java.util.List;

public class Tringle_toy {
    
    public static void main(String[] args) {

        String[] triangleToy = {"221", "333", "345", "113"};

        List<String> result = classifyTriangles(triangleToy);

        System.out.println(result);
    }

    public static List<String> classifyTriangles(String[] triangleToy) {

        List<String> result=new ArrayList<>();
        for(int i=0; i<triangleToy.length; i++)
        {
            String a=new String(triangleToy[i]);

            int b=help(a);

            if(b==2)
            {
                result.add("Isosceles");
            }
            else if(b==1)
            {
                result.add("Equilateral");
            }
            else if( b==0)
            {
                result.add("None of these");
            }
        }

        return result;
    }
    public static int help(String a)
    {
          int x=(int)(a.charAt(0)-'0');
          int y=(int)(a.charAt(1)-'0');
          int z=(int)(a.charAt(2)-'0');

          if(x==y && y==z)
          {
            return 1;
          }
          else if(x==y && x+x>z)
          {
            return 2;
          }
          else if(y==z && y+y>z)
          {
            return 2;

          }
          else if(x==z && x+x>y)
          {
            return 2;

          }
          else{
            return 0;
          }
          
    } 
}
