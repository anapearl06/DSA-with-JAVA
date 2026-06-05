package D_Conditionals.Special;
import java.util.Scanner;
public class multiple_2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0)
        {
            System.out.println("One number is multiple of the other");
        }
        else
        {
            System.out.println("Not multiples");
        }
    }
}