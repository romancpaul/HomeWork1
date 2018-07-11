package HomeWork6;


/*6
 * Write a program that converts the height of a person
 * from centimeters to feet and inches.
 * The printed values should be two integers.
 */
public class ConvertsToInchAndFeet {

   public static void main(String[] args) {

        double inchToCentimeters = 2.54;
        double feetToCentimeters = 30.48;

        int centimeters = 178;

        double convertedFeetToCentimeters = (int) (centimeters / feetToCentimeters);
        double resultConversionInchToCentimeter = centimeters - (convertedFeetToCentimeters * feetToCentimeters);
        double convertedInchToCentimeters = resultConversionInchToCentimeter / inchToCentimeters;

        System.out.println((int)convertedFeetToCentimeters + " feet and " +
                (int)convertedInchToCentimeters + " inches." )  ;

    }

   }
