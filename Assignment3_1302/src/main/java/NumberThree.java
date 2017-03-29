import javax.management.openmbean.ArrayType;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by LAUW on 3/21/17.
 */
public class NumberThree {
    public static void main(String[] args) {
        ArrayList<String> quote = new ArrayList<String>();
        quote.add("How");
        quote.add("Are");
        quote.add("You?");

        System.out.println(stutter(quote, 2));

    }

    private static ArrayList<String> stutter(ArrayList<String> repeat, int k){
        //create a newRepeat to store all the added ArrayList.
        ArrayList<String> newRepeat = new ArrayList<String>();
        //create the for loop here.
        for (int i = 0; i < repeat.size(); i++) {
            String s = repeat.get(i*k);
            //create an if statement to see check if k is 0, negative, or positive(greater than k).
            if (k > 0) {
                //store it in the ArrayList repeat;
                newRepeat.add(s);
                //after acquire s, repeat the value of s k(number) times.


            }

            if (k == 0) {
                return null;
            }

            if (k < 0) {
                return null;
            }
        }
        repeat.addAll(newRepeat);

        return repeat;
    }

}
