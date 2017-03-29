import java.util.Set;
import java.util.*;

/**
 * Created by LAUW on 3/7/17.
 */
public class ArrayListPractice {
    public static void main(String[] args) {
        int count[] = {34,22,10,60,30,22};
        Set<Integer> set = new TreeSet<Integer>();

        try{
            for (int i = 0; i <  count.length; i++){
                set.add(i);
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
