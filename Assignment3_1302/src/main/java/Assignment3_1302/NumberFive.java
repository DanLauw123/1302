package Assignment3_1302;

import java.util.ArrayList;

/**
 * Created by LAUW on 3/21/17.
 */
public class NumberFive {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello");
        System.out.println(markLength4(strings));
    }

    //create the markLength4 that return the edited string.
    private static ArrayList<String> markLength4(ArrayList<String> mark){
        //create a new arrayList newMark that would store the new edited arrayList, mark.

        //create the for loop that would check each index of the array.
        for (int i = 0; i < mark.size() ; i++) {
            String s = mark.get(i);
            //create an if-statement that would compare the size of strings, if the strings is at least length 4, place **** in front of it.
            if(s.length() >= 4){
                //create a new index before the string with at least 4 characters.
                mark.add(i-1, "****");
            }

            //return the statement
        }
        return mark;
    }
}
