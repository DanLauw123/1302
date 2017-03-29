import ThisMethodExamples.BankConstructor;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by LAUW on 2/7/17.
 */
public class BankAccount {
    public static void main(String[] args){
        Scanner console = new Scanner (System.in);
        //introduction to variables so they could be use later on the program.
        int accounts = 0;
        String name;
        double checking;
        double savings;

        //ask the users to enter information.
        System.out.println("How many accounts would you like to open today?");
        accounts = console.nextInt();
        BankConstructor[] folder= new BankConstructor[accounts];


        //create the for loop to allow the users to enter as many as accounts they like.
        for (int i = 0; i<accounts; i++ ){
            System.out.println("Please enter the name for the account.");
            name = console.next();
            System.out.println("Please enter the amount of deposits for checking.");
            checking = console.nextDouble();
            System.out.println("Please enter the amount of deposits for savings.");
            savings = console.nextDouble();

            BankConstructor newAccounts = new BankConstructor(name, checking, savings);
            folder[i] = newAccounts;
        }

        System.out.println(Arrays.toString(folder));

    }
}
