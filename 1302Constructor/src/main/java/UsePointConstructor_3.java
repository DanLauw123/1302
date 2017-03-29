/**
 * Created by LAUW on 2/7/17.
 */
public class UsePointConstructor_3 {
    public static void main(String[] args) {
        // create two Point objects
        PointConstructor p1 = new PointConstructor(5, -2);
        PointConstructor p2 = new PointConstructor(-4, 3);

        // print each point
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }
}
