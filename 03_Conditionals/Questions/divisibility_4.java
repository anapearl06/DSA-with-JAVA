import java.util.Scanner;
public class divisibility_4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0)
        {
            System.out.println("Divisible by both 3 and 5");
        }
        else
        {
            System.out.println("Not divisible by both 3 and 5");
        }
    }
}