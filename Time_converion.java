public class Time_converion {
     public static void main(String[] args) {

        String s = "07:05:45PM";

        System.out.println(timeConversion(s));
    }

    public static String timeConversion(String s) {
            
        int hour=Integer.parseInt(s.substring(0,2));

        String ampm=s.substring(8,10);

        if(ampm.equals("PM") && hour !=12)
        {
            hour+=12;
        }

        if(ampm.equals("AM") && hour==12)
        {
            hour=0;
        }

        String hh=String.format("%02d",hour);

        return hh+s.substring(2,8 );
    }
}
