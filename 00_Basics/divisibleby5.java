import java.util.Scanner;
public class divisibleby5 {
    public static void main() {
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