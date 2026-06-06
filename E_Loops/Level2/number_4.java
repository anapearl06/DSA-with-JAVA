package E_Loops.Level2;
import java.util.Scanner;
public class number_4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (original == sum) {
            System.out.println("Armstrong Number");

        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}