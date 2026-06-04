package F_Arrays;
public class array2d
{
    public static void main(String[] args)
    {
        // 2D Array = rows + columns
        // It looks like a table

        int[][] numbers = {
                             {10, 20},
                             {30, 40}
                                        };

        // Printing elements

        System.out.println(numbers[0][0]);      // 10
        System.out.println(numbers[0][1]);      // 20

        System.out.println(numbers[1][0]);      // 30
        System.out.println(numbers[1][1]);      // 40
    }
}