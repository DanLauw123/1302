/**
 * Created by LAUW on 2/28/17.
 */
public class DemoPoems {
    public static void main(String[] args) {
        //initiate the subclasses and give each object a name(use letter to represent the name of the object).
        Haiku h = new Haiku();
        Couplet c = new Couplet();
        Limerick l = new Limerick();

        //create a set values for String a and int b below.
        h.set_Strings("Haiku", 3);
        c.set_Strings("Couplet", 2);
        l.set_Strings(" Limerick ", 5);

        //print out the type of poet and the lines using the subclasses.
        System.out.println("The poem is " + h.poet() + " lines it has. ");
        System.out.println("The poem is " + c.poet() + " lines it has. ");
        System.out.println("The poem is " + l.poet() + " lines it has. ");

    }
}
