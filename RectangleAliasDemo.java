class Rectangle {
    double width;
    double height;
}

public class RectangleAliasDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 4;
        r1.height = 5;

        Rectangle r2 = r1;   // copies the reference, not the object
        r2.width = 10;       // changes the one shared object

        System.out.println("r1.width = " + r1.width);
        System.out.println("r2.width = " + r2.width);
        System.out.println("r1 == r2? " + (r1 == r2));
    }
}