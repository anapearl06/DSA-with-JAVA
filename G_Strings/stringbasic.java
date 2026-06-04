package G_Strings;
public class stringbasic
{
    public static void main(String[] args)
    {
        // String is used to store text
        // Example: name, city, message, etc.

        String name = "Ananya";

        // Printing complete string
        System.out.println(name);

        // Printing characters using index
        // Index starts from 0

        System.out.println(name.charAt(0));         // A
        System.out.println(name.charAt(1));         // n

        // Finding length of string
        System.out.println(name.length());

        // Converting to uppercase
        System.out.println(name.toUpperCase());

        // Converting to lowercase
        System.out.println(name.toLowerCase());
    }
}