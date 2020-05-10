public class Date{
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth = // days in each month
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int theMonth, int theDay, int theYear){
        month = checkMonth(theMonth); // validate month
        year = theYear; // could validate year
        day = checkDay(theDay); // validate day

        System.out.printf(
              "Date objects constructor for date %s\n", this);
    }

    private int checkMonth(int testMonth){
        if(testMonth > 0 && testMonth <= 12)
            return testMonth;
        else
            throw new IllegalArgumentException("month must be 1-12");
    }

    private int checkDay(int testDay){
        // check if day in range for month
        if(testDay > 0 && testDay <= daysPerMonth[month])
            return testDay;
        if(month == 2 && testDay == 29 && (year % 400 == 0 ||
          (year % 4 == 0 && year % 100 != 0)))
            return testDay;
        throw new IllegalArgumentException(
                "day out-of-range for the specified month and year");
    }
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}
