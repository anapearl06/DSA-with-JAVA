package D_Conditionals.Special;
import java.util.Scanner;
public class char_8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            System.out.println("Letter");
        }
        else if (ch >= '0' && ch <= '9')
        {
            System.out.println("Digit");
        } else
        {
            System.out.println("Neither");
        }
    }
}
