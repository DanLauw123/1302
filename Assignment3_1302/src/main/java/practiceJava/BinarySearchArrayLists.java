package practiceJava;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by LAUW on 3/29/17.
 */
public class BinarySearchArrayLists {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        boolean b = true;
        //create a while loop to keep asking the users to enter numbers until they press 00000.  e
        while (b) {
            //ask user to enter the numbers, press 00000 when done.
                System.out.println("Please enter the number: Press 00000 (five zeroes) when finished ");
                int numbers = console.nextInt();
                if (numbers == 00000) {
                    b = false;
                }
                numsList.add(numbers);
            }

        //ask the users which number they would like to search.
        System.out.println("Please enter the number you would like to search. ");
        int target = console.nextInt();

        //print it out to the user, by showing which index the number is located.
        System.out.println(binarySearch(numsList, target));


    }

    private static int binarySearch(ArrayList<Integer> nums, int target) {
        int min = 0;
        //must be nums.size() -1 because we set min = 0 and we dont need the size of the array(nums), just the max index of the array(nums
        int max = nums.size() - 1;

        //create a while loop(compares min and max). keep looping if min <= max.
        while(min<=max)//as long as min is less than max the loop will continue.
        {
            int mid = (min+max)/2;
            if(target > nums.get(mid)){
                min = mid + 1;
            }else if(target < nums.get(mid)){
                max = mid - 1;
            }else {
                return mid;
            }
        }
        return -(min+1);
    }
}
