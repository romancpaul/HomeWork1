package HomeWork9;

/*
    9. Write a program that accepts 2 integers values as input
    between 13 and 89 and prints true if there is a common digit in both numbers.
     Example: x=34, y=48, the output should be true.
 */

public class CommonDigitsInNumbers {
    public static void main(String[] args) {

        int x = 38;
        int y = 48;

        boolean isValid = (x >= 13 && x <= 89) || (y >= 13 && y <= 89);

        int xFirstDigit = x / 10;
        int xSecondDigit = x % 2;
        int yFirstDigit = y / 10;
        int ySecondDigit = y % 2;

        String result = (isValid && (xFirstDigit == yFirstDigit) ||
                (xSecondDigit == ySecondDigit)) ?
                "True" : "False";
        System.out.println(result);


    }
}
