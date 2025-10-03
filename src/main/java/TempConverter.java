import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);
        boolean j = true;
        while(j)
        {
            System.out.println("Choose conversion direction");
            System.out.println("1. Convert Fahrenheit to Celsius ");
            System.out.println("2. Convert Celsius to Fahrenheit ");
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
                    System.out.println("Enter temperature in Fahrenheit: ");
                    double km = sc.nextDouble();
                    System.out.println();
                    System.out.println("Conversion Results:");
                    System.out.println("Fahrenheit: " + km);
                    km = (km-32) * ((double) 5 /9);
                    System.out.println("Celsius: " + km);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter temperature in Celsius: ");
                    double miles = sc.nextDouble();
                    System.out.println();
                    System.out.println("Conversion Results: ");
                    System.out.println("Celsius: " + miles);
                    miles = miles * ((double) 9 /5) +32;
                    System.out.println("Fahrenheit: " + miles);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    j=false;
                    break;

            }
        }
    }
}