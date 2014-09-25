/**
 * Write a program that prints the numbers between 258 and 393 (both inclusive) which do not end with 5. 
 * The program should print the output so as to have one value per line.
 */

package onlinetestjava1;

/**
 *
 * @author aarestu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 258; i < 393; i++) {
            if( i % 5 != 0 || i % 10 == 0 || i == 0){
                System.out.println(i);
            }
        }
    }

}
