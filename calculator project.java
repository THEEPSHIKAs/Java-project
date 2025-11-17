import java.util.*;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter num2: ");
        double b = sc.nextDouble();

        double res = 0;
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = b != 0 ? a / b : 0;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Result = " + res);
    }
}
