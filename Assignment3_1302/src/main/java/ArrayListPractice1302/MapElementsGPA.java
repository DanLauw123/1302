package ArrayListPractice1302;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LAUW on 3/7/17.
 */
public class MapElementsGPA {
    public static void main(String[] args) {
        Map gpa= new HashMap();

        //use put comments to insert elements into the Map
        gpa.put("Daniel ", 3.96);
        gpa.put("Michael ", 4.0);

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + gpa);
        System.out.println("\n Daniel's GPA value is = " +gpa.get("Daniel "));

        //Use Size method to check the size of Map
        System.out.print("\n Size Of GPA" + gpa.size());

        //Use Size method to check the Clear of Map
        gpa.clear();
        System.out.print("\n Size Of GPA " + gpa.size());
    }
}
