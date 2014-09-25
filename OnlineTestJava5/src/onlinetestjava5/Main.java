/**
 * Write a program which will print the below structures according to the input provided to the program. 
 * The program should accept 3 inputs in the form of numbers between 1 and 9, both inclusive (one number per line) 
 * and then generate the corresponding structures based on the input.
 */

package onlinetestjava5;

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
        final int numInput = 3;
        int[] inputs = new int[numInput];
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("input :");
        for (int i = 0; i < numInput; i++) {
            try {
                inputs[i] = scan.nextInt();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                return;
            }
            
            if(inputs[i] < 1 || inputs[i] > 9) {
                System.err.println("range [1-9]");
                return;
            }
        }
        
        System.out.println("\noutput :");

        for (int input : inputs) {
            printPiramid(input);
        }
    }
    
    private static void printPiramid(int input){
        int space = input - 1;
        
        for (int i = 1; i <= input; i++) {
            //add space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space--;
            
            //print value
            for (int j = 1; j <= i; j++) {
                System.out.print(i + ((j==i)?"\n":" "));
            }
        }
    }
}
