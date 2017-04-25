import java.util.Scanner;

/**
 * Created by dominicmassimo on 4/24/17.
 */
public class CalcDriver {

    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter numbers seperated by a space");
        Calculator calculation = new Calculator();
        String input = keyboard.nextLine();
        String [] nums;
        nums = input.split( " ");
        double a = calculation.findSum(nums);
        double b = calculation.findAverage(nums);
        double c = calculation.findProduct(nums);
        double d = calculation.findFactorial(nums);
        System.out.println("The sum of the numbers is " + a);
        System.out.println("The avg of the numbers is " + b);
        System.out.println("The product of the numbers is " + c);
        System.out.println("The factorials of the numbers is " + d);

    }

}
