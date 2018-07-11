package HomeWork5;

/* 5
  Write a program that converts the height of a person from feet & inches
 (e.g 5 feet 10 inches) to centimeters (~178cm).
 The value should be integer.
 To convert a double value to an integer, you can use the cast operator:
 double d = 33.4;
 int i = (int)d; // i will be 33;
 */
public class ConvertsToCm {

    public static void main(String[] args) {
        int inches = 10;
        int feet = 5;

       double conversion = ((feet * 30.48) + (inches * 2.54));

       double d = conversion;
       int i = (int)d;

        System.out.println("The height is: " + i + " centimeters.");
    }


    }

