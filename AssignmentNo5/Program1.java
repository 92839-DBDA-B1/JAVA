import java.util.*;

// Custom Exception
class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(String msg) {
        super(msg);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            if (input.length() > 80) {
                throw new ExceptionLineTooLong("The string is too long!");
            } else {
                System.out.println("Valid String. Length: " + input.length());
            }
        } catch (ExceptionLineTooLong e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
