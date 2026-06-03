import java.util.Scanner;
public class temperature_8
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if (temp < 15)
        {
            System.out.println("Cold");
        }
        else if (temp <= 30)
        {
            System.out.println("Warm");
        }
        else
        {
            System.out.println("Hot");
        }
    }
}