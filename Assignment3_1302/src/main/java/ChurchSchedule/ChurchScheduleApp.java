package ChurchSchedule;

import java.io.File;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
/**
 * Created by LAUW on 3/23/17.
 */
public class ChurchScheduleApp {
    private static Scanner console = new Scanner(System.in);
    private static String home = System.getProperty("user.home");
    public static File file = new File(home + File.separator + "Desktop" + File.separator + "ChurchSchedule.txt");

    public static void main(String[] args) {

        //ask user to enter the month:
        System.out.println("Please enter the month: ");
        String month = console.next();


        //ask user to enter the amount of Sundays in that month.
        System.out.println("Please enter the amount of Sunday in " + month);
        String numOfSundays;
        numOfSundays = console.next();

        listDates();




    }
    //create a method that would ask the user to enter how many weeks there are in given month.
    private static ArrayList<String> numWeeks (ArrayList<String> week){
        ArrayList<String> newWeek = new ArrayList<String>();
        for (int i = 0; i < week.size(); i++) {
            String s = week.get(i);
            newWeek.add(s);
        }
        return newWeek;
    }

    private static void listDates(){
        //ask user to enter the dates for the Sundays
        //store the dates in an ArrayList.
        ArrayList<ArrayList<String>> listDates = new ArrayList();
        //create do and while loop that would take in the dates.
        int i = 0;
        boolean askDates = false;
        do{
            ArrayList<String> date = new ArrayList<String>();
            System.out.println("Please enter the dates:  Press 'q' when done. ");
            String dates = console.next();
            if(dates.equalsIgnoreCase("Q")){
                saveFile(listDates);
            }

        }

        while(askDates);


    }
    public static void saveFile(ArrayList<ArrayList<String>> array){
        try {
            //write the the file and save it.
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < array.size(); i++) {
                for (int j = 0; j < array.get(i).size(); j++) {
                    bw.write(array.get(i).get(j));
                    bw.write(" ");
                }
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {

        }
    }
    //ask them to enter the WL, drummers, guitarist, keyboardist, vocals, and bassist.
    //store the list on the ArrayList.

    //return the output(arraylist) to the users.

}
