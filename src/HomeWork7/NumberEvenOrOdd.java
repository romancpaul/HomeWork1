package HomeWork7;

/*
7. Write a program to accept a positive number,
 not bigger than 1000 and check that the number is even or not.
 Prints 1 if the number is even or 0 if the number is odd.
 (check if they did the check)
 */

public class NumberEvenOrOdd {
    public static void main(String[] args) {

        int number = 242;

        boolean isInRange = (number <=1000) && (number >=0);


        String evenNumber = (number %2 == 0)?
                "1" : "0";

        String result = (isInRange) ?
                evenNumber :
                "Number is not valid";
        System.out.println(result);


    }
}
