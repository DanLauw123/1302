/**
 * Created by LAUW on 2/7/17.
 */
public class PointMainConstructor_3 {
    public static void main(String[] args) {
        // create two Point objects
        PointConstructor p1 = new PointConstructor(7, 2);   // calling the constructor
        PointConstructor p2 = new PointConstructor(4, 3);   // calling the constructor

        // print each point and its distance from origin
        System.out.println("p1 is (" + p1.x + ", " + p1.y + ")");
        System.out.println("distance from origin = " +
                p1.distanceFromOrigin());

        System.out.println("p2 is (" + p2.x + ", " + p2.y + ")");
        System.out.println("distance from origin = " +
                p2.distanceFromOrigin());

        // translate each point to a new location
        p1.translate(11, 6);
        p2.translate(1, 7);

        // print the points again
        System.out.println("p1 is (" + p1.x + ", " + p1.y + ")");
        System.out.println("p2 is (" + p2.x + ", " + p2.y + ")");
    }
}
