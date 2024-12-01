import java.util.Scanner;

public class IT24103899Lab5Q3 {

    
    public static final double ROOM_CHARGES_PER_DAY = 48000;

    
    public static final double DISCOUNT_3_TO_4_DAYS = 0.1;  // 10% discount
    public static final double DISCOUNT_5_TO_30_DAYS = 0.2;  // 20% discount

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        int startDate;
        int endDate;
        double totalAmount;
        int numberOfDaysReserved;

        
        System.out.println("Enter the start date (1 to 31): ");
        startDate = input.nextInt();

        System.out.println("Enter the end date (1 to 31): ");
        endDate = input.nextInt();

        
        if (startDate > endDate) {
            System.out.println("Start date must be less than end date.");
            return; 
        }
        numberOfDaysReserved = endDate - startDate + 1;

        
        if (numberOfDaysReserved < 1 || numberOfDaysReserved > 31) {
            System.out.println("Number of days reserved must be between 1 and 31.");
            return;
        }

        
        System.out.println("Room charges per day: " + ROOM_CHARGES_PER_DAY);

        double discount = 0.0;

   
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discount = DISCOUNT_3_TO_4_DAYS;
        } else if (numberOfDaysReserved >= 5 && numberOfDaysReserved <= 30) {
            discount = DISCOUNT_5_TO_30_DAYS;
        }

        
        double discountedAmount = ROOM_CHARGES_PER_DAY * numberOfDaysReserved;
        totalAmount = discountedAmount * (1 - discount);

        // Display total amount
        System.out.println("Total amount to be paid: " + totalAmount);
    }
}
