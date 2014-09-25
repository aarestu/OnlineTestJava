/**
 * Write a program that accepts 10 student records (roll number and score) 
 * and prints them in decreasing order of scores. In case there are multiple 
 * records pertaining to the same student, the program should choose a single record 
 * containing the highest score. The program should be capable of accepting a multi-line input. 
 * Each subsequent line of input will contain a student record, that is, 
 * a roll number and a score (separated by a hyphen). 
 * The output should consist of the combination of roll number 
 * and corresponding score in decreasing order of score.
 */
package onlinetestjava8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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

        String inputPattern = "^\\d+-\\d{1,2}|100$";
        String input;
        String[] arrinp;

        Map<Integer, Integer> student = new LinkedHashMap<>();

        for (int i = 0; i < 10; i++) {
            do {
                input = scan.nextLine();
                if (!input.matches(inputPattern)) {
                    System.err.println("[id student-score] ex: 1004-89");
                }
            } while (!input.matches(inputPattern));

            arrinp = input.split("-");
            int key = Integer.parseInt(arrinp[0]);
            int value = Integer.parseInt(arrinp[1]);

            if (student.get(key) == null || student.get(key) < value) {
                student.put(key, value);
            }

        }

        System.out.println("output :");
        printMap(sortByValue(student));

    }

    public static Map sortByValue(Map unsortMap) {
        List list = new LinkedList(unsortMap.entrySet());

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }
        });

        Map sortedMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void printMap(Map<Integer, Integer> map) {
        for (Integer key : map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }
    }

}
