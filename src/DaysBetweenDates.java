public class DaysBetweenDates {
    public static void main(String[]args) {
        // Input dates
        int year1=2024,month1=4,day1=10; // First date
        int year2=2024,month2=4,day2=24; // Second date
        // Calculate the difference in days
        int daysBetween=calculateDays(year1,month1,day1,year2,month2,day2);
        // Output the result
        System.out.println("Number of days between "+formatDate(year1,month1,day1)+" and "+formatDate(year2,month2,day2)+" is: "+daysBetween);
    }
    // Function to calculate days between two dates
    public static int calculateDays(int year1,int month1,int day1,int year2,int month2,int day2) {
        // Number of days in each month
        int[] daysInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        // Leap year adjustment
        if(isLeapYear(year1)) {
            daysInMonth[1]=29; // February has 29 days in a leap year
        }
        // Calculate days from year1 to year2
        int days=0;
        for(int year=year1;year<year2;year++) {
            if(isLeapYear(year)) {
                days+=366; // Add 366 days for leap year
            }else {
                days+=365; // Add 365 days for non-leap year
            }
        }
        // Calculate days in year2 till the given date
        for(int month=1;month<month2;month++) {
            days+=daysInMonth[month-1];
        }
        days+=day2;
        // Subtract days in year1 till the given date
        for(int month=1;month<month1;month++) {
            days-=daysInMonth[month-1];
        }
        days-=day1;
        return days;
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year%4==0&&year%100!=0)||(year%400==0);
    }
    // Function to format date as string
    public static String formatDate(int year,int month,int day) {
        return String.format("%02d/%02d/%04d",day,month,year);
    }
}