package ArrayListPractice1302;

import java.util.*;
/**
 * Created by LAUW on 3/7/17.
 */
public class HashSet {
    public static void main(String args[]) {
        String count[] = {"Ah","Bh","Ae","ee","ff","dd", "eef"};
        Set<String> set = new TreeSet<String>();
        try {
            for(int i = 0; i < count.length; i++) {
                set.add(count[i]);
            }
            System.out.println(set);
            set.remove(count[5]);
            System.out.println(set);
            System.out.println("Size of the set "+set.size());
            set.clear();
            System.out.println("Size of the set "+set.size());

        }
        catch(Exception e) {}
    }
}
