package Assignment2; /**
 * Created by LAUW on 2/27/17.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by LAUW on 2/23/17.
 */
public class DemoHorse2 {

    private static Scanner console = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("How many horses do you want to enter? ");
        int numberOfHorses = console.nextInt();
        ArrayList<RaceHorse> listOfHorses = new ArrayList<RaceHorse>();

        //make a comment here
        for (int i = 0; i <numberOfHorses ; i++) {
            RaceHorse rh = new RaceHorse();

            System.out.println("Please enter the name of the horse:");
            rh.setName(console.next());

            System.out.println("Please enter the color of the horse:");
            rh.setColor(console.next());

            System.out.println("Enter the birthday of the horse:");
            rh.setYear(console.nextInt());

            listOfHorses.add(rh);
        }


        System.out.println("Who won the race? ");
        String winner = console.next();
        for (RaceHorse r : listOfHorses) {
            //
            if(r.getName().toLowerCase().contains(winner)){
                r.setRace(r.getRace() + 1);
            }

        }

        for (RaceHorse r : listOfHorses ) {
            System.out.println(r.getName() + " " + r.getColor() + " " + r.getYear() + " " + r.getRace() + ". ");

        }


//        System.out.println("Enter the amount of race the horse has completed.");
//        int completedRace = console.nextInt();
//        rh.setRace(completedRace);
//
//
//        System.out.println("The name of the horse is " + h.getName() + ". " + "Its color is " + h.getColor() + "." + "The horse was born in "
//                + h.getYear() + ". " + "The horse has completed " + rh.getRace() + "races.");


    }

}

// git add -A
// git commit -m "String Message"
// git push origin master
//

