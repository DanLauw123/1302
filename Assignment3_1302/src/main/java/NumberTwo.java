import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Owner on 3/20/2017.
 */
public class NumberTwo {
    public static void main(String[] args) {
        ArrayList<String> shakespear = new ArrayList<String>();
        shakespear.add("to");
        shakespear.add("be");
        shakespear.add("or");
        shakespear.add("not");
        shakespear.add("to");
        shakespear.add("be");
        shakespear.add("that");
        shakespear.add("is");
        shakespear.add("the");
        shakespear.add("question");

        System.out.println(removeInRange(shakespear, "free", "rich"));


    }



    private static ArrayList<String> removeInRange(ArrayList<String> strings, String beginningString, String endString){
        //for each loop to count through each index and get the value on that index.
        //for(int  i; i<strings.size();i++);
        //create new arraylist to store all of the "throw-away strings"
        ArrayList<String> newStrings = new ArrayList<String>();
        for (int i = 0; i<strings.size();i++) {
            String s = strings.get(i);
            //compare to beginning
            if(s.compareToIgnoreCase(beginningString) > 0 && s.compareToIgnoreCase(endString) < 0)/*just return an integer number: -, 0, and + numbers*/{
                //string is object so we do remove(object).
                newStrings.add(s);
            }//this return an integer.

        }
        //remove all the unwanted strings stored in the data Arraylist.
        strings.removeAll(newStrings);
        //return strings, because we have modified it (strings is the name of the ArrayList in the parameters).
        return strings;

    }
}
