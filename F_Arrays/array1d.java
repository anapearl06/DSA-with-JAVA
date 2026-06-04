package F05_Arrays;
public class array1d
{
    public static void main()
    {
        // 1D Array (One Dimensional Array)
        // A 1D array stores multiple values of the same data type
        // in a single line using one variable name.

        // Creating an integer array
        int[] num= {10, 20, 30, 40, 50};

        // Accessing elements using index number
        // Index always starts from 0

        System.out.println(num[0]);         // First element
        System.out.println(num[1]);         // Second element
        System.out.println(num[2]);         // Third element

        // Printing all elements using loop

        for (int i = 0; i < num.length; i++)
        {
            System.out.println(num[i]);
        }
    }
}