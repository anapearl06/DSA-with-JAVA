import java.util.Scanner;
public class switchcase {
    public static void main() {

        // taking input from user
        Scanner sc = new Scanner(System.in);

        // asking user to enter a number
        System.out.print("Enter a number between 1 to 3: ");
        int num = sc.nextInt();

        // switch case starts here
        switch (num) {

            case 1:
                System.out.println("You entered One");
                break;

            case 2:
                System.out.println("You entered Two");
                break;

            case 3:
                System.out.println("You entered Three");
                break;

            default:
                System.out.println("Invalid Number");

        }

    }
}