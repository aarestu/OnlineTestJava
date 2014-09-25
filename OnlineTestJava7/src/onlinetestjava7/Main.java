/**
 * Write a program which will take the year (yyyy) and the numeric sequence of 
 * the month (0-11) as its input. The program will return the day on which the 28th 
 * of that particular month and year falls. The input can consist of two year-month combinations, one combination per line.
 */

package onlinetestjava7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aarestu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("input : ");
        String input = scan.nextLine();
        
        if (input.matches("^\\d{4}-(\\d[0-1]?)$")) {
            String[] strDate = input.split("-");

            int y = Integer.parseInt(strDate[0]);
            int m = Integer.parseInt(strDate[1]);
            int d = 28;
            Calendar calendar = new GregorianCalendar(y, m, d);
            
            String nameDay = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
            System.out.println(nameDay);
        }else{
            System.err.println("Input Error");
        }
    }

}
