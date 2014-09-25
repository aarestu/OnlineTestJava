/**
 * Write a program which will accept a single pair of strings separated by a comma; 
 * the program should calculate the sum of ascii values of the characters of each string. 
 * The program should then subtract the sum of the ascii values of 
 * the second string from the sum of the ascii values of the first string.
 */

package onlinetestjava3;

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
        
        System.out.print("Input string : ");
        String input = scan.nextLine();
        
        String arrInput[] = input.split(",");
        
        if(arrInput.length <= 0 || arrInput.length > 2) {
            //error 
            return;
        }
        
        int d = sumASCII(arrInput[0].getBytes()) - sumASCII(arrInput[1].getBytes());
        
        System.out.println(arrInput[0] + " - " + arrInput[1] + " = " + d);        
    }
    
    private static int sumASCII(byte[] bytes) {
        int sum = 0;
        for (byte b : bytes) {
            sum += b;
        }
        return sum;
    }

}
