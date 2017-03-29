package Assignment3_1302;

import java.util.ArrayList;

/**
 * Created by LAUW on 3/21/17.
 */
public class NumberFour {
    public static void main(String[] args) {
        ArrayList<String> quote = new ArrayList<String>();
        quote.add("for");
        quote.add("score");
        quote.add("and");
        quote.add("seven");
        quote.add("years");
        quote.add("ago");
        quote.add("our");

        System.out.println(removeShorterStrings(quote));


    }

    private static ArrayList<String> removeShorterStrings(ArrayList<String> shorter){
        //create a newShorter ArrayList to store the wanted and the unwanted Arrays.
        ArrayList<String> newShorter = new ArrayList<String>();
        //create a for loop that scans through each index in the ArrayList.
        for (int i = 0; i<shorter.size();i++) {
            //create two String value (oddIndex and evenIndex) to compare the odd and even index to see which one is greater
            String oddIndex = shorter.get(i);
            String evenIndex = shorter.get(i + 1);

            //remove the index with fewer strings by creating an if statement that would compare the two Strings value (oddIndex vs evenIndex)
            if (oddIndex.length() <= evenIndex.length()) {
                shorter.remove(i);
                newShorter.add(evenIndex);
            } else {
                shorter.remove(i + 1);
                newShorter.add(oddIndex);
            }
        }


        shorter.addAll(newShorter);
        return shorter;

    }
}
