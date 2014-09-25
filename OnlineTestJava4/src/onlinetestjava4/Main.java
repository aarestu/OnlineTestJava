/**
 * Write a program to calculate the distance travelled by a car at different time intervals. 
 * The initial velocity of the car is 36 km/hr and the constant acceleration is 5 m/s2.
 * 
 * The formula to calculate distance is:
 * Distance Travelled = u*t+((a*t*t)/2) where,
 * u = initial velocity of the car (36 km/hr)
 * a = acceleration of the car (5 m/s2)
 * t = time duration in seconds
 * 
 * The program should accept 2 time intervals as the input (one time interval per line) 
 * and print the distance travelled in meters by the car (one output per line).
 * 
 */
package onlinetestjava4;

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

        double u = 36.0 * 1000 / 3600;
        double a = 5.0;

        int timeInput = 2;

        double[] t = new double[timeInput];

        System.out.println("input :");
        
        for (int i = 0; i < timeInput; i++) {
            try {
                t[i] = scan.nextDouble();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                return;
            }
        }

        System.out.println("\noutput :");

        for (double duration : t) {
            System.out.println(distance(u, a, duration));
        }

    }

    private static double distance(double u, double a, double t) {
        return u * t + ((a * t * t) / 2);
    }
}
