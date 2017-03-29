package Assignment3_1302;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Owner on 3/13/2017.
 */
public class NumberOne {

    public static void main(String[] args) {
        //create the arrayList called numbers for the input.
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);

        //print out the rangeBetweenZeroes method.
        System.out.println(rangeBetweenZeroes(numbers));



    }

    //build a method that take the ArrayList.
    //give arraylist of Integers
    private static int rangeBetweenZeroes(ArrayList<Integer> range ) {
        //position first zero and the last zero is in.
        int numberOfZeros = 0;
        // r is the VALUE of the given index, not the index itself.
        // for (int i=0; i<range.size();i++;
        // int r = range.get(i);
        // if (range.get(i).equals(0)){ numberOfZeros++}
        for (Integer r : range) {
            if (r.equals(0)) {
                numberOfZeros++;
            }
        }//if no zero is found.
        if (numberOfZeros == 0) {
            return 0;
        }//if only ONE zero is found.
        if (numberOfZeros == 1) {
            return 1;
        }

        //initiate the variables.
        int firstPosition = 0; //also called statement.
        int lastPosition = 0;
        for (int i = 0; i < range.size(); i++) {
            if(range.get(i)==0){
                firstPosition = i;
                break;
            }
        }//range.size - 1 because the range has 0 which is not counted. max 5 instead of 6, which printed out the error.
        for (int i = range.size()-1; i > -1  ; i--) {
            if(range.get(i)==0){
                lastPosition = i;
                break;
            }

        }
        return lastPosition - firstPosition + 1;
    }

}
