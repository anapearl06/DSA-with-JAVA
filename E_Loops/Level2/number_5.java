package E_Loops.Level2;
import java.util.Scanner;
public class number_5
{
    public static void main()
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {

                sum = sum + i;
            }
        }

        if (sum == num) {

            System.out.println("Perfect Number");

        } else {

            System.out.println("Not a Perfect Number");
        }
    }
}
