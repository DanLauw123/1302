/**
 * Created by LAUW on 2/7/17.
 */
public class BankConstructor {
    private String name;
    private double checking;
    private double savings;


    public BankConstructor(String amountOfName, double amountOfChecking, double amountOfSavings)
    {
        this.name = amountOfName;
        this.checking = amountOfChecking;
        this.savings = amountOfSavings;

    }

    /*public BankConstructor()
    {
        this.name = "Daniel";
        this.checking = 300;
        this.savings = 1000;


    }*/
    public void changeName(String amountOfName){
        this.name = amountOfName;
    }
    public void changeChecking(double amountOfChecking){

        this.checking = amountOfChecking;
    }
    public void changeSavings(double amountOfSavings){

        this.savings = amountOfSavings;
    }


    public String toString()
    {
        return "This account is of " + name + " and has total checking of $" + checking + " total of $" + savings + "."; //this line of code will be used as a return method.
    }
}
