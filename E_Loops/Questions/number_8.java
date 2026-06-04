package E04_Loops.Questions;
import java.util.Scanner;
public class number_8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial = " + factorial);
    }
}