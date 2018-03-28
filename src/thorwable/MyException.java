package thorwable;

public class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }

    public MyException() {
        super();
    }

    public static void exp(String subject) throws MyException {
        if(subject.equals("INT102")) {
            throw new MyException("Subject Error");
        }
        System.out.println("Stop method");
    }
}
