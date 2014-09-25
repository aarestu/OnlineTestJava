/**
 * Kermit, a frog hops in a particular way such that:
 * 1. He hops 20cm in the first hop, 10cm in the second hop and 5cm in the third hop.
 * 2. After three hops Kermit rests for a while and then again follows the same hopping pattern.
 * 
 * Calculate the total distance travelled by Kermit (in centimeters) for the provided number of hops. 
 * Exactly 4 numbers of hops will be provided to the program (one number per line) 
 */

package onlinetestjava6;

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
        final int numInput = 4;

        int[] numHops = new int[numInput];
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("input :");
        
        for (int i = 0; i < numInput; i++) {
            try {
                numHops[i] = scan.nextInt();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                return;
            }
        }

        System.out.println("\noutput :");

        for (int numHop : numHops) {
            System.out.println(sumHop(numHop));
        }
    }
    
    private static int sumHop(int numHop) {
        int sum = 0;
        int hop = 20;
        for (int i = 0; i < numHop; i++) {
            hop = (i % 3 == 0)? 20 : hop / 2; 
            sum += hop;
        }
        return sum;
    }
}
