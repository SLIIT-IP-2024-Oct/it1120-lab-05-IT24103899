import java.util.Scanner;

public class IT24103899Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (0 or greater): ");
        int number = input.nextInt();

               if (number < 0) {
            System.out.println("Input must be a number zero or greater.");
        } else {
                       switch (number) {
                case 0:
                    System.out.println("No prize");
                    break;
                case 1:
                    System.out.println("Pen");
                    break;
                case 2:
                    System.out.println("Umbrella");
                    break;
                case 3:
                    System.out.println("Bag");
                    break;
                case 4:
                    System.out.println("Travelling Chair");
                    break;
                default:
                    System.out.println("Headphone");
                    break;
            }
        }

        input.close(); 
    }
}
