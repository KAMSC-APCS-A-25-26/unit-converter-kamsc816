import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
        Scanner sc = new Scanner(System.in);
        boolean j = true;
        while(j){
            System.out.println("Convert time to total seconds");
            System.out.println();
            System.out.println("Enter hours: ");
            int hours = sc.nextInt();
            System.out.println("Enter minutes: ");
            int minutes = sc.nextInt();
            System.out.println("Enter seconds: ");
            int seconds = sc.nextInt();
            sc.nextLine();
            System.out.println();

            System.out.println("Time Conversion:");
            System.out.println("Input: " + hours + " hour, " + minutes + " minute, and " + seconds + " second");
            int totalSeconds = (hours*60*60)+(minutes*60)+seconds;
            System.out.println("Total seconds: " + totalSeconds + " seconds");
            System.out.println();

            System.out.println("Calculation: ");
            int hourSec = hours * 3600;
            System.out.println(hours + " hours x 3600 = " + hourSec + " seconds");
            int minuteSec = minutes * 60;
            System.out.println(minutes + " minutes x 60 = " + minuteSec + " seconds");
            System.out.println(seconds + " seconds = " + seconds + " seconds");
            System.out.println();

            System.out.println("Do you want to convert another time? (y/n): ");
            String choice = sc.nextLine().trim().toLowerCase();
            System.out.println();

            if(choice.equals("n")){
                System.out.println("Goodbye! ");
                j = false;
            }
        }
    }
}