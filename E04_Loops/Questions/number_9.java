package E04_Loops.Questions;
import java.util.Scanner;
public class number_9
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;

        while (num > 0)
        {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }
        System.out.println("Product of digits = " + product);
    }
}