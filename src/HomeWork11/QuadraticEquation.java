package HomeWork11;

/*
 * 11.
 * Print the complex solutions of the quadratic equation, not just the real ones.
 */

public class QuadraticEquation {
    public static void main(String[] args) {
        int a =2;
        int b =4;
        int c =6;

        double discriminant = b*b - 4*a*c;

        double quadraticFormula1 = (-b) / 2*a;
        double quadraticFormula2 = (discriminant >= 0) ?
                                 Math.sqrt(discriminant) / 2*a :
                                 Math.sqrt(-discriminant) / 2*a;

        if(discriminant>=0)
        {
            System.out.println("First solution to the quadratic formula is: "
                    +(quadraticFormula1+quadraticFormula2));
            System.out.println("Second solution to the quadratic formula is: "
                    +(quadraticFormula1-quadraticFormula2));

        }else{
            System.out.println("Solution 1 = " + quadraticFormula1 + " + i " + quadraticFormula2);
            System.out.println("Solution 2 = " + quadraticFormula1 + " - i " + quadraticFormula2);
        }

    }
}
