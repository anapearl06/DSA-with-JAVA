import java.util.Scanner;
public class evenodd_2
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Even");
        } else
        {
            System.out.println("Odd");
        }
    }
}