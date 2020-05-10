import java.util.Date;

public class DateAndTime {
    public static void main(String[] args){
        Date date = new Date();

        displayDateAndTime(date);
    }
    public static void displayDateAndTime(Date date){
        System.out.println(date.toString());
    }
}
