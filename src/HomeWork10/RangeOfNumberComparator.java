package HomeWork10;

/*
10.
  Write a program to find the number of integers within the range of two numbers received as input
  and that are divisible by another number (also received as input).
  Example: x=5, y=20 and p=3, the output should be 5. For x=6, y=22 and p=2, the output should be 9
 */

public class RangeOfNumberComparator {
        public static void main(String[] args) {

            int x_StartRange = 5;
            int y_EndOfRange = 20;
            int p_Divisor = 3;

            int intervalLength = y_EndOfRange - x_StartRange;

            int counterDivisibleNumb = intervalLength / p_Divisor;

            int remainder = intervalLength % p_Divisor;
            if (calculateRest(x_StartRange, y_EndOfRange, p_Divisor) < remainder)
            {
                counterDivisibleNumb++;
            }

            boolean isIntervalValid = (y_EndOfRange >= x_StartRange);
            String result = (isIntervalValid) ?
                    "" + counterDivisibleNumb :
                    "Invalid data";
            System.out.println(result);

        }

        public static int calculateRest (int startNumb, int endNumb, int divisor)
        {
            int restInFront = 0;
            int restAtBack = 0;
            for (int i=0; i<divisor; i++)
            {
                if((startNumb-i) % divisor == 0)
                {
                    restAtBack = i;
                    break;
                }
            }

            for (int i = 0; i<divisor; i++)
            {
                if((endNumb - i) % divisor == 0)
                {
                    restInFront = -1;
                    break;
                }
            }
            return (restInFront + restAtBack);
        }

    }
