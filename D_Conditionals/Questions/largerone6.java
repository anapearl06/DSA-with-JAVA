package D_Conditionals.Questions;
import java.util.Scanner;
public class largerone6 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b)
        {
            System.out.println(a + " is larger");
        }
        else
        {
            System.out.println(b + " is larger");
        }
    }
}