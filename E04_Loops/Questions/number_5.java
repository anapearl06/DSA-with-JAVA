package Questions;
import java.util.Scanner;
public class number_5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}
