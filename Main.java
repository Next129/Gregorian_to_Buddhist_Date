import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter day month year :");
        int day = scanner.nextInt();
        String month = scanner.next();
        int year = scanner.nextInt();
        
        int[] result = convertDate(day, month, year);
        
        System.out.println(result[0] + "/" + result[1] + "/" + result[2]);
        
        scanner.close();
    }

    public static int[] convertDate(int day, String monthName, int yearAD) {
        int monthNumber = 0;
        
        switch (monthName) {
            case "January": monthNumber = 1; break;
            case "February": monthNumber = 2; break;
            case "March": monthNumber = 3; break;
            case "April": monthNumber = 4; break;
            case "May": monthNumber = 5; break;
            case "June": monthNumber = 6; break;
            case "July": monthNumber = 7; break;
            case "August": monthNumber = 8; break;
            case "September": monthNumber = 9; break;
            case "October": monthNumber = 10; break;
            case "November": monthNumber = 11; break;
            case "December": monthNumber = 12; break;
        }
        
        int yearBE = yearAD + 543;
        
        return new int[]{monthNumber, day, yearBE};
    }
}
