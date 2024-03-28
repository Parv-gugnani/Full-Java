import java.util.Calendar;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        
       Scanner scan = new Scanner(System.in);

        int month = scan.nextInt();
        int date = scan.nextInt();
        int year = scan.nextInt();
        
        scan.close(); 

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, date); 
        
        
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
         switch (dayOfWeek){
            case Calendar.MONDAY:
                System.out.print("MONDAY");
                break;
            case Calendar.TUESDAY:
                System.out.print("TUESDAY");
                break;
            case Calendar.WEDNESDAY:
                System.out.print("WEDNESDAY");
                break;
            case Calendar.THURSDAY:
                System.out.print("THURSDAY");
                break;
            case Calendar.FRIDAY:
                System.out.print("FRIDAY");
                break;
            case Calendar.SATURDAY:
                System.out.print("SATURDAY");
                break;
            case Calendar.SUNDAY:
                System.out.print("SUNDAY");
                break;
        }
    }
}

