package HomeWork4;//4.
// Print the area and circumference of a circle from the radius
// (learn which types of variables to choose?)

public class Circle {

    public static void main(String[] args) {
	    int radius = 3;
	    double area = 3.14 * (radius * radius);
        System.out.println("The area of circle is: " + area);

        double circumference = 3.14 * 2 * radius;

        System.out.println("The circumference of the circle is: " + circumference);
    }
}
