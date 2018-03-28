package thorwable;

import java.util.Scanner;

public class Thorwable {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
//        for (int i = 0; y != -999; i++) {
//            Scanner scan = new Scanner(System.in);
//            System.out.print("X: ");
//            x = scan.nextInt();
//            System.out.print("Y: ");
//            y = scan.nextInt();
//            System.out.println(devideMe(x , y));
//        }
        while (y != -999) {
            System.out.println("Compute X/Y");
            Scanner scan = new Scanner(System.in);
            System.out.print("X: ");
            x = scan.nextInt();
            System.out.print("Y: ");
            y = scan.nextInt();
            try {
                System.out.println("from devideMe X/Y = " + x + '/' + y + " = " + devideMe(x, y));
            } catch (ArithmeticException ex) {
                System.err.println("!!!!! Y cannot be 0 !!!!");
            }

            System.out.println("from devideMe2 X/Y = " + x + '/' + y + " = " + devideMe2(x, y));
        }
    }

    public static int devideMe(int x, int y) {
        return x / y;
    }

    public static int devideMe2(int x, int y) {
        int result;
        try {
            result = x / y;
        } catch (ArithmeticException ex) {
            result = 0;
        }
        return result;
    }

    public static void exp(String subject) throws MyException {
        if (subject.equals("INT102")) {
            throw new MyException("Subject Error");
        }
        System.out.println("Stop method");
    }
}
