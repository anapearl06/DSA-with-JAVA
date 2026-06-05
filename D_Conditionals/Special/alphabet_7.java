package D_Conditionals.Special;
import java.util.Scanner;
public class alphabet_7
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'm') {
            System.out.println("Between a and m");

        } else if (ch >= 'n' && ch <= 'z') {
            System.out.println("Between n and z");
        }
    }
}