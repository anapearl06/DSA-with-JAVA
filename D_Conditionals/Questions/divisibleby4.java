package D_Conditionals.Questions;
import java.util.Scanner;
public class divisibleby4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("divisible by 5");
        } else {
            System.out.println("not divisible by 5");
        }
    }
}