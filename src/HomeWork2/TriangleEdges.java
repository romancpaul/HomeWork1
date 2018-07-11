
/*2
 * ASSIGNMENT 2: Given three values representing the length of the edges of a triangle,
 * print if the triangle is right-angled or not
 * (also check if the triangle is a valid one).
 */

package HomeWork2;

public class TriangleEdges {

    public static void main(String[] args) {
        int a = 12;
        int b = 35;
        int c = 37;

        int aSquared = a*a;
        int bSquared = b*b;
        int cSquared = c*c;

        int sumOfABSquared = aSquared+bSquared;

        boolean isRightAngled = sumOfABSquared == cSquared;

        String result =  isRightAngled ?
                "HomeWork1.Triangle is right-angled." :
                "HomeWork1.Triangle is not right-angled.";

        System.out.println(result);
    }
}
