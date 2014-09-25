/**
 * Write a program which will accept three sentences (one sentence per line) 
 * and print the words having Initial Caps within the sentences. 
 */
package onlinetestjava9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        StringBuilder sb = new StringBuilder("");

        Pattern myPattern = Pattern.compile("[A-Z][a-z]+");

        for (int i = 0; i < 3; i++) {
            sb.append(scan.nextLine());
            sb.append("\n");
        }
        
        Matcher m = myPattern.matcher(sb);
        while (m.find()) {
            System.out.println(m.group(0));
        }
    }

}
