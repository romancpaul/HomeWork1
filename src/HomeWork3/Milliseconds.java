

/*3
 * ASSIGNMENT 3: Write a program that calculates the number of milliseconds
 * contained in X hours, Y minutes and Z seconds,
 * where X, Y and Z are inputs introduced by the user.
 * (check that Y < 60, Z < 60, and both >= 0)
 */

package HomeWork3;


public class Milliseconds {

    public static void main(String[] args) {

        int hours = 1;
        int minutes = 2;
        int seconds = 8;

        int milliseconds = 1000;

        boolean hoursIsValid = hours>=0;
        boolean minutesIsValid = (minutes >=0) && (minutes<60);
        boolean secondsIsValid = (seconds >=0) && (seconds<60);

        int totalTimeInSeconds = (hours*60*60)+ (minutes*60) + seconds;
        int totalTimeInMilliseconds = totalTimeInSeconds*milliseconds;

        String result = (hoursIsValid && minutesIsValid && secondsIsValid) ?
                "The time in milliseconds is: " + totalTimeInMilliseconds :
                "Invalid data entry";
        System.out.println(result);



           }

}
