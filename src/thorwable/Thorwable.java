package thorwable;

import java.util.Scanner;

public class Thorwable {

    public static void main(String[] args) throws MyException {
//        int x = 0;
//        int y = 0;
//        while (y != -999) {
//            System.out.println("Compute X/Y");
//            Scanner scan = new Scanner(System.in);
//            System.out.print("X: ");
//            x = scan.nextInt();
//            System.out.print("Y: ");
//            y = scan.nextInt();
//            try {
//                System.out.println("from devideMe X/Y = " + x + '/' + y + " = " + devideMe(x, y));
//            } catch (ArithmeticException ex) {
//                System.err.println("!!!!! Y cannot be 0 !!!!");
//            }
//
//            System.out.println("from devideMe2 X/Y = " + x + '/' + y + " = " + devideMe2(x, y));
//        }
//    }
//
//    public static int devideMe(int x, int y) {
//        return x / y;
//    }
//
//    public static int devideMe2(int x, int y) {
//        int result;
//        try {
//            result = x / y;
//        } catch (ArithmeticException ex) {
//            result = 0;
//        }
//        return result;

        try {
           exp("INT105");
           
        } catch(MyException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("*********");
        }
        
        
    }

    public static void exp(String subject) throws MyException {
        if (subject.equals("INT102")) {
            MyException obj = new MyException("Exception: I have got \"A\"");
            throw obj;
        }
        System.out.println("I will get \"A\"");
    }
}
