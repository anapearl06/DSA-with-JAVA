package E_Loops.Level2;
import java.util.Scanner;
public class number_1
{
    public static void main()
    {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num > 0)
        {
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}
