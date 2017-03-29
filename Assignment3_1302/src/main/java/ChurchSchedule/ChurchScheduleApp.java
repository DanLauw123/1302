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




    }

    /**
     * This method get the dates of Sundays from user.
     */
    private static void getDates(){
        //ask user to enter the dates for the Sundays.


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
