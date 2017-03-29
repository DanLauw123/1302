import java.util.Map;
import java.util.TreeMap;

/**
 * Created by LAUW on 3/7/17.
 */
public class MapElements {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<String, Integer>();
        ages.put("Daniel", 96);
        ages.put("Michael", 97);
        ages.put("Yuvella", 92);
        ages.put("Sam", 87);

        for (String name: ages.keySet()) {
            int age = ages.get(name);
            System.out.println(name + "-->" + age);
        }


        }

    }

