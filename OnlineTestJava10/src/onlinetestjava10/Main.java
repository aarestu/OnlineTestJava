/**
 * Sam wants to select a username in order to register on a website.
 * 
 * The rules for selecting a username are:
 * 1. The minimum length of the username must be 5 characters and the maximum may be 10.
 * 2. It should contain at least one letter from A-Z
 * 3. It should contain at least one digit from 0-9
 * 4. It should contain at least one character from amongst @#*=
 * 5. It should not contain any spaces
 * 
 * Write a program which accepts 4 usernames (one username per line) as input 
 * and checks whether each of them satisfy the above mentioned conditions.
 * 
 * If a username satisfies the conditions, the program should print PASS (in uppercase)
 * If a username fails the conditions, the program should print FAIL (in uppercase)
 * 
 * Suppose the following usernames are supplied to the program:
 * 1234@a
 * ABC3a#@
 * 1Ac@
 * ABC 3a#@
 * 
 * Then the output should be:
 * FAIL
 * PASS
 * FAIL
 * FAIL

 */
package onlinetestjava10;

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
        String[] usernames = new String[4];

        /**
         * saya bingung di soalnya yg lowercase tidak disebutkan diizinkan atau tidak
         * yang disebutkan cuma yang uppercase [A-Z]
         * tapi di contoh ABC3a#@ karakter 'a' diizinkan 
         * sedangkan pada contoh 1234@a karakter 'a' tidak diizinkan 
         * oleh karena itu saya membuat beberapa opsi (dalam komentar)
         * [1] lowercase diizinkan  
         * [2] lowercase tidak diizinkan
         * [3] asumsi saya tidak menyebutkan aturan untuk lowercase [a-z] 
         *     pada regex, sehingga lowercase diabaikan (hasil sama dengan contoh)
         * 
        */
        
        //lowercase [a-z] diizinkan
        //String pattern = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[@#*=])(?=[\\S]+$).{5,10}$";
        
        //tidak termasuk lowercase [a-z]
        //String pattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#*=])(?=[\\S]+$)(?=[^a-z]+$).{5,10}$";
        
        //tidak menyebutkan aturan untuk lowercase [a-z]
        String pattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#*=])(?=[\\S]+$).{5,10}$";
        
        for (int i = 0; i < 4; i++) {
            usernames[i] = scan.nextLine();
        }
        
        System.out.println("output :");
        for (String username : usernames) {
            System.out.println(username.matches(pattern) ? "PASS" : "FAIL");
        }
    }

}
