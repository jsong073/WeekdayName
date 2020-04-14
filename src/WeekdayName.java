import java.util.Scanner;

public class WeekdayName {
    public static void main (String[] args) {
        int weekdayNum = 0;
        String weekday = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weekday number (1 - 7): ");
        weekdayNum = input.nextInt();

        if (weekdayNum == 1){
            weekday = "Sunday";
        } else if (weekdayNum == 2) {
            weekday = "Monday";
        } else if (weekdayNum == 3) {
            weekday = "Tuesday";
        } else if (weekdayNum == 4) {
            weekday = "Wednesday";
        } else if (weekdayNum == 5) {
            weekday = "Thursday";
        } else if (weekdayNum == 6) {
            weekday = "Friday";
        } else if (weekdayNum == 7) {
            weekday = "Saturday";
        } else {
            weekday = "not a valid number";
        }

        System.out.println("It is " + weekday);
    }

}
