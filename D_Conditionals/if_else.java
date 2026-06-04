package D_Conditionals;
public class if_else {
    static void main() {

        // storing salary value
        int salary = 27586;

        // checking if salary is greater than 10000
        // adding bonus of 2000
        if (salary > 10000) salary = salary + 2000;
        else {

            // adding bonus of 1000
            salary = salary + 1000;

        }

        // printing final salary
        System.out.println(salary);
    }
}

