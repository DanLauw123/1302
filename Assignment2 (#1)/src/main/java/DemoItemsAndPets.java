import java.util.Scanner;

/**
 * Created by LAUW on 2/28/17.
 */
public class DemoItemsAndPets {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        ItemSold item = new ItemSold();
        PetSold pet = new PetSold();

        System.out.println("Is your item a pet or other (if it's not a pet please select other). ");
        String input = console.next();

        //create if and else statement below to determine and execute the input from the users.

        //this is an if statement for 'other'
    if(input.equalsIgnoreCase("other")) {
        //get the invoice number, description, and the price.
        System.out.println("Please enter the invoice number: ");
        int invoice = console.nextInt();
        item.setInvoice(invoice);

        System.out.println("Please enter the description of the item: ");
        String portray = console.next();
        item.setDescription(portray);

        System.out.println("Finally, enter the price of the item: ");
        int price = console.nextInt();
        item.setPrice(price);

        System.out.println("The invoice number is " + item.getInvoice() + " and the description of the item is a "
                + item.getDescription() + " and the item has a price of " + "$" + item.getPrice());

    }//this is an else if statement for 'pet'
    else {
        if (input.equalsIgnoreCase("pet")) {
            //get the invoice number, description, price, and the condition of the pet (vaccinated, neutered, or housebroken)
            System.out.println("Please enter your invoice number: ");
            int invoice = console.nextInt();
            item.setInvoice(invoice);

            System.out.println("Please give a description of your pet (the type of it): ");
            String portray = console.next();
            item.setDescription(portray);

            System.out.println("Enter below the amount you payed for the pet: ");
            int price = console.nextInt();
            item.setPrice(price);



            //create method to acquire information whether the pet has been vaccinated or not.
            System.out.println(" Has your pet receive a vaccination? Enter yes or no. ");
            String answer = console.next();
            if (answer.equalsIgnoreCase("yes")) {
                pet.setVaccinated(true);
            } else if(answer.equalsIgnoreCase("no")) {
                pet.setVaccinated(false);
            } else {
                System.out.println("Please enter yes or no, restart the program. ");
            }


            //create a method to acquire information whether the pet is neutered.
            System.out.println(" Has your pet been neutered? Enter yes or no. ");
            String result = console.next();
            if (result.equalsIgnoreCase("yes")) {
                pet.setNeutered(true);
            } else if(result.equalsIgnoreCase("no")) {
                pet.setNeutered(false);
            } else {
                System.out.println("Please enter yes or no, restart the program. ");
            }


            //create a method to acquire information whether the pet is housebroken.
            System.out.println(" Has your pet receive training to be considered as housebroken? Enter yes or no. ");
            String response = console.next();
            if (response.equalsIgnoreCase("yes")) {
                pet.setHouseBroken(true);
            } else if(response.equalsIgnoreCase("no")) {
                pet.setHouseBroken(false);
            } else {
                System.out.println("Please enter yes or no, restart the program. ");
            }
           //print the output below.
            System.out.println("The invoice number is a " + item.getInvoice() + " and the description of the pet is "
                    + item.getDescription() + " and the item has a price of " + "$" + item.getPrice());
            System.out.println("The pet has receive vaccination : " + pet.getVaccinated() + ". The pet has been trained to be a housebroken pet: " + pet.getHouseBroken()
            + ". The pet has been neutered: " + pet.getNeutered());

        }
    }

    }
}
