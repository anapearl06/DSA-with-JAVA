package D_Conditionals.Special;
import java.util.Scanner;
public class vote_4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18)
        {
            System.out.println("Eligible to Vote");
        }
        else
        {
            System.out.println("Not Eligible to Vote");
        }
    }
}