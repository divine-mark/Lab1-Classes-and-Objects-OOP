public class Rectangle {
    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle[] rects = new Rectangle[5];

        rects[0] = new Rectangle();
        rects[0].width = 3;
        rects[0].height = 4;

        rects[1] = new Rectangle();
        rects[1].width = 5;
        rects[1].height = 5;

        rects[2] = new Rectangle();
        rects[2].width = 2;
        rects[2].height = 8;

        rects[3] = new Rectangle();
        rects[3].width = 6;
        rects[3].height = 3;

        rects[4] = new Rectangle();
        rects[4].width = 4;
        rects[4].height = 4;

        Rectangle largest = rects[0];

        for (int i = 1; i < rects.length; i++) {
            if (rects[i].area() > largest.area()) {
                largest = rects[i];
            }
        }

        System.out.println("Largest rectangle:");
        System.out.println("width = " + largest.width);
        System.out.println("height = " + largest.height);
        System.out.println("area = " + largest.area());
        System.out.println("perimeter = " + largest.perimeter());
    }
}