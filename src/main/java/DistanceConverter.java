import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {

        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);
        boolean j = true;
        while(j)
        {
            System.out.println("Choose conversion direction");
            System.out.println("1. Convert Miles to Kilometers ");
            System.out.println("2. Convert Kilometers to Miles ");
            System.out.println("3. Exit ");
            System.out.println("Enter your choice (1, 2, or 3): ");

            int choice = sc.nextInt();
            if (choice<1 || choice > 3){
                System.out.println("Invalid choice");
                System.out.println("Please enter 1, 2, or 3");
                continue;
            }
            switch  (choice){
                case 1:
                    System.out.println("Enter distance in miles: ");
                    double km = sc.nextDouble();
                    System.out.println();
                    System.out.println("Conversion Results:");
                    System.out.println("Miles: " + km);
                    km *= 1.60935;
                    System.out.println("Kilometers: " + km + "km");
                    break;
                case 2:
                    System.out.println("Enter distance in kilometers: ");
                    double miles = sc.nextDouble();
                    System.out.println();
                    System.out.println("Conversion Results: ");
                    System.out.println("Kilometers: " + miles);
                    miles /= 1.60935;
                    System.out.println("Miles: " + miles + "mi");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    j=false;
                    break;

            }
        }
    }
}