import java.util.Scanner;

public class IT24103899Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int no1, no2, no3;
        int largest, smallest;

               System.out.println("Enter the first number:");
        no1 = input.nextInt();

        System.out.println("Enter the second number:");
        no2 = input.nextInt();

        System.out.println("Enter the third number:");
        no3 = input.nextInt();

      
        System.out.println("User Entered Numbers:");
        System.out.println("First number: " + no1);
        System.out.println("Second number: " + no2);
        System.out.println("Third number: " + no3);

            if (no1 >= no2 && no1 >= no3) {
            largest = no1;
        } else if (no2 >= no1 && no2 >= no3) {
            largest = no2;
        } else {
            largest = no3;
        }

        if (no1 <= no2 && no1 <= no3) {
            smallest = no1;
        } else if (no2 <= no1 && no2 <= no3) {
            smallest = no2;
        } else {
            smallest = no3;
        }

        // Print the largest and smallest numbers
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }
}
