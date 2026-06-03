package C_Operators;
public class logope
{
    public static void main()
    {
        int age = 20;
        int marks = 85;

        // Logical AND (&&)
        // Returns true if both conditions are true
        boolean andResult = (age >= 18 && marks >= 80);

        // Logical OR (||)
        // Returns true if at least one condition is true
        boolean orResult = (age < 18 || marks >= 80);

        // Logical NOT (!)
        // Reverses the result
        boolean notResult = !(age < 18);

        // Printing results
        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);
    }
}