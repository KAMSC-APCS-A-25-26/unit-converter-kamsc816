import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {

        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices

        boolean j = true;
        while(j)
        {
            System.out.println("------Menu------");
            System.out.println("1. Convert Miles to Kilometers ");
            System.out.println("2. Convert Kilometers to Miles ");
            System.out.println("3. Exit ");
            System.out.println("Enter your choice (1, 2, or 3): ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice<1 || choice > 3){
                System.out.println("No such element");
                System.out.println("Enter your choice (1, 2, or 3: ");
                choice = sc.nextInt();
            }
            switch  (choice){
                case 1:
                    System.out.println("Enter distance in kilometers: ");
                    double km = sc.nextDouble();
                    System.out.println();
                    System.out.println("Conversion Results:");
                    System.out.println("Kilometers: " + km);
                    km /= 1.609;
                    System.out.println("Miles: " + km);
                    break;
                case 2:
                    System.out.println("Enter distance in miles: ");
                    double miles = sc.nextDouble();
                    System.out.println();
                    System.out.println("Conversion Results: ");
                    System.out.println("Miles: " + miles);
                    miles *= 1.609;
                    System.out.println("Kilometers + " + miles);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    j=false;
                    break;

            }
        }
    }
}