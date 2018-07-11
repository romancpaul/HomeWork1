package HomeWork12;

public class QuadraticEquationTwoDigits {
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
            System.out.println("First solution to the quadratic formula is: %.2f"
                    +(quadraticFormula1+quadraticFormula2));
            System.out.println("Second solution to the quadratic formula is: %.2f"
                    +(quadraticFormula1-quadraticFormula2));

        }else{
            System.out.printf("Solution 1 = %.2f + %.2f i\n", quadraticFormula1, quadraticFormula2);
            System.out.printf("Solution 2 = %.2f - %.2f i\n", quadraticFormula1, quadraticFormula2);
        }

    }

}
