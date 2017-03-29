import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by LAUW on 2/23/17.
 */
public class DemoCandles {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

        String userInput;
        System.out.println("Please select the type of your candle: ");
        System.out.println();
        System.out.println("Regular or Scanted");
        userInput = console.next();

        //this is where I make the if and else methods to determine which candle the user has selected.

        if (userInput.equalsIgnoreCase("regular")){

            Candle c = new Candle();
            String color;
            int height;
            int price;
            //below is method for the color of the candle.
            System.out.println("Please enter the color of your candle: ");
            color = console.next();
            c.setColor(color);
            //set method to get height (in inches)
            System.out.println("Please enter the height (in inches): ");
            height = console.nextInt();
            c.setHeight(height);

            //this method will print out the color of the candle, the height, and the total price to the users.
            System.out.println("Your regular candle has a color of " + c.getColor() +
                    " and has the height of " + c.getHeight() + " and a total price of " + "$"+ c.getPrice() + ".");

        } else if (userInput.equalsIgnoreCase("scanted")){
            ScantedCandle sc = new ScantedCandle();
            Candle c = new Candle();
            String color;
            int height;
            int scantedprice;

            //below is method for the color of the candle.
            System.out.println("Please enter the color of your candle: ");
            color = console.next();
            c.setColor(color);
            //set method to get height (in inches)
            System.out.println("Please enter the height (in inches): ");
            height = console.nextInt();
            //set the method to sc.setHeight because you want to override the height method.
            sc.setHeight(height);

            //this method will print out the color of the candle, the height, and the total price to the users.
            System.out.println("Your scanted candle has a color of " + c.getColor() +
                    " and has the height of " + sc.getHeight() + " and a total price of " + "$ " + sc.getScantedPrice() + ".");


        }

    }


}
