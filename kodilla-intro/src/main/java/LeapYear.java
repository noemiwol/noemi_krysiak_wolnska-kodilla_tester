public class LeapYear {

    private static boolean laepYear(int year)
    {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args){

        int year = 2020;

        int nextYear = 2021;

        if (laepYear(year))
        {
            System.out.println("The given year is leap.");
        }
        else
        {
            System.out.println("The given year is not a leap year.");
        }

        if (laepYear(nextYear))
        {
            System.out.println("The given year is leap.");
        }
        else
        {
            System.out.println("The given year is not a leap year.");
        }
    }
    }

