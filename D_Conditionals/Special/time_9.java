package D_Conditionals.Special;
import java.util.Scanner;
public class time_9
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour (0-23): ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        if (hour >= 0 && hour < 12) {

            System.out.println("AM");

        } else if (hour >= 12 && hour <= 23) {

            System.out.println("PM");

        } else {

            System.out.println("Invalid Time");
        }
    }
}