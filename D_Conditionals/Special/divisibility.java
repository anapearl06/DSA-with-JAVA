package D_Conditionals.Special;
import java.util.Scanner;
public class divisibility
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {

            System.out.println("FizzBuzz");

        } else if (num % 3 == 0) {

            System.out.println("Fizz");

        } else if (num % 5 == 0) {

            System.out.println("Buzz");

        } else {

            System.out.println("Number is neither divisible by 3 nor 5");
        }
    }
}