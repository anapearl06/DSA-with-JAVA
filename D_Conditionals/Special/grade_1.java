package D_Conditionals.Special;
import java.util.Scanner;
public class grade_1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if
        (marks >= 75)
        {
            System.out.println("Grade B");
        }
        else if
        (marks >= 60)
        {
            System.out.println("Grade C");
        }
        else if
        (marks >= 40)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade F");
        }
     }
  }
