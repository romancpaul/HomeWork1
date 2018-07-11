package HomeWork1;
/*1.
 * ASSIGNMENT 1: Given three values representing the angles in a triangle,
 * print if the triangle is right-angled or not.
 * (check if the triangle is a valid one)
 */

public class Triangle {
    public static void main(String[] args) {

        int ang1 = 45;
        int ang2 =90;
        int ang3 = 45;

        //int sumOfAng = ang1+ang2+ang3;

        boolean isRightAngled = (ang1 == 90) || (ang2 == 90) || (ang3 == 90);

        String result =  isRightAngled ?
                "HomeWork1.Triangle is right-angled." :
                "HomeWork1.Triangle is not right-angled.";

        System.out.println(result);

    }

}
