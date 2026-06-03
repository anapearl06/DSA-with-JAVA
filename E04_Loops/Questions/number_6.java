package E04_Loops.Questions;
import java.util.Scanner;
public class number_6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers = " + sum);
    }
}