/**
 * Ross is an event organizer. He has received data regarding 
 * the participation of employees in two different events. 
 * Some employees have participated in only one event and others have participated in both events. 
 * Ross now needs to count the number of employees who have taken part in both events. 
 * The records received by Ross consist of employee ids, which are unique. 
 * 
 * Write a program that accepts the employee ids participating in each event 
 * (the first line relates to the first event and the second line relates to the second event). 
 * The program should print the number of common employee ids in both the events.
 */

package onlinetestjava2;

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
        
        String inputId1, inputId2;
        String[] arrId1, arrId2;
        int result = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("first event : ");
        inputId1 = scan.nextLine();
        arrId1 = inputId1.split(",");
        
        System.out.print("second event : ");
        inputId1 = scan.nextLine();
        arrId2 = inputId1.split(",");
        
        
        for (String target : arrId1) {
            if(searchLoop(arrId2, target)) result++;
        }
        
        System.out.println("output \n" + result);
    }
    
    private static boolean searchLoop(String[] arrId, String target) {
        for (String str : arrId) {
            if(str.equals(target)){
                return true;
            }
        }
        return false;
    }
}
