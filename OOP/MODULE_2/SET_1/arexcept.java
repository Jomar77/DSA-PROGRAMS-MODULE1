package MODULE_2.SET_1;

/* Write an application that throws and catches an ArithmeticException 
when you attempt to take the square root of a negative value. 
Prompt the user for an input value and try the Math.sqrt() method on it.
 The application either displays the square root or catches the thrown Exception 
 and displays the message Can't take square root of negative number.*/
import java.util.Scanner;

public class arexcept {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            int num = inputDevice.nextInt();
            if  (num > 0) {
                System.out.println("The square root of " + num + " is " + Math.sqrt(num));
            } else if (num < 0) {
                throw new ArithmeticException("Can't take square root of negative number");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
