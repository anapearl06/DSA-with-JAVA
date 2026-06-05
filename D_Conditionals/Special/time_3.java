package D_Conditionals.Special;
import java.util.Scanner;
public class time_3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();

        if (hour >= 5 && hour < 12)
        {
            System.out.println("Good Morning");
        }
        else if (hour >= 12 && hour < 17)
        {
            System.out.println("Good Afternoon");
        }
        else if (hour >= 17 && hour < 21)
        {
            System.out.println("Good Evening");
        }
        else
        {
            System.out.println("Good Night");
        }
    }
}