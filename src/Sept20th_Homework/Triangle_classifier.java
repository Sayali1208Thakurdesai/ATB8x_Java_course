package Sept20th_Homework;

public class Triangle_classifier {
    public static void main(String[] args) {

        int side1 = 5;
        int side2 = 3;
        int side3 = 2;

        if (side1 == side2 && side2 == side3 && side3 == side1) {

            System.out.println("The triangle is equilateral");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is scalene");
        }


    }
}
