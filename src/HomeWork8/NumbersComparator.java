package HomeWork8;

/*
8. Write a program that accepts three integers from the user and return true
  if the second number is greater than the first number and third number is greater than second number.
  Consider also a condition which if it is true,
  the second number does not need to be greater than first number.
 */

public class NumbersComparator {
    public static void main(String[] args) {
        int a = 11;
        int b = 2;
        int c = 3;

        boolean secondIsGreaterThanFirst = b > a;
        boolean thirdIsGreaterThanSecond = c > b;

        String result = ((secondIsGreaterThanFirst && thirdIsGreaterThanSecond) ||
                (!secondIsGreaterThanFirst && thirdIsGreaterThanSecond)) ?
                "True" : "False";
        System.out.println(result);


    }
}
