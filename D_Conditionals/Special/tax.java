package D_Conditionals.Special;
import java.util.Scanner;
public class tax
{
    public static void main()
    {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int income = sc.nextInt();

        if (age > 18 && income > 500000) {

            System.out.println("Eligible for Tax");

        } else {

            System.out.println("Not Eligible for Tax");
        }
    }
}
