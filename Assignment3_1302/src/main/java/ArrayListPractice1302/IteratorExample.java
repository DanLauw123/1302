package ArrayListPractice1302;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by LAUW on 3/7/17.
 */
public class IteratorExample {
    public static void main(String args[]) {
// Create an array list
        ArrayList alphabet = new ArrayList();

// add elements to the array list
        alphabet.add("C");
        alphabet.add("A");
        alphabet.add("E");
        alphabet.add("B");
        alphabet.add("D");
        alphabet.add("F");

// Use iterator to display contents of al
        System.out.print("Original contents of alphabet: ");
        Iterator itr = alphabet.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

// Modify objects being iterated

    }
}
