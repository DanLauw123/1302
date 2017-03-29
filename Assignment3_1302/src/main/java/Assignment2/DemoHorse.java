package Assignment2;

import java.util.Scanner;

/**
 * Created by LAUW on 2/23/17.
 */
public class DemoHorse {

    private static Scanner console = new Scanner(System.in);
    public static void main(String[] args){

        Horse h = new Horse();
        RaceHorse rh = new RaceHorse();

        System.out.println("Please enter the name of horse: ");
        String name = console.next();
        h.setName(name);

        System.out.println("Please enter the color of the horse: ");
        String color = console.next();
        h.setColor(color);

        System.out.println("Please enter the year which the horse was born: ");
        int birth = console.nextInt();
        h.setYear(birth);




        System.out.println("Enter the amount of race the horse has completed.");
        int completedRace = console.nextInt();
        rh.setRace(completedRace);


        System.out.println("The name of the horse is " + h.getName() + ". " + "Its color is " + h.getColor() + "." + "The horse was born in "
                + h.getYear() + ". " + "The horse has completed " + rh.getRace() + "races.");

    }

}

// git add -A
// git commit -m "String Message"
// git push origin master
//
