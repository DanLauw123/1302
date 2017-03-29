package practiceJava;

import java.util.Arrays;

/**
 * Created by LAUW on 3/29/17.
 */
public class BinarySearchCode {
    public static void main(String[] args) {
        int[] a = {10,20,82,59,67,4,79,99,200,1200};
        int index = binarySearch(a , 20);

        System.out.println(index);
    }
    //Arrays.binarySearch(array(name), minIndex, maxIndex, targetValue).
    //this method will pass the name of the array and the target to see if such target exists.
    private static int binarySearch(int[] w, int target){
        //create int min and max.
        int min = 0;
        int max = w.length - 1; //max is (a.length - 1) because min is set to ZERO.

        //create the while loop where as long as the min <= max, the loop will continue looping
        while (min <= max){
            //find the midpoint first
            int mid = (min+max)/2;
            //create the if and else loop to see if the target value is less or greater than the midpoint value.
            if(target > w[mid]){
                min = mid +1;
            }else if (target < w[mid]){
                max = mid -1;
            }else {
                return mid; //this is when the target is found.
            }
        }

        //come out of the while loop and create a return statement if the target is not found.
        return -(min +1);

    }
}
