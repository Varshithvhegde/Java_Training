import java.time.*;
public class LocalDateEX {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);
        LocalDate yesterday = date.minusDays(1);
        System.out.println("Yesterday's date: " + yesterday);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Tomorrow's date: " + tomorrow);
    }
}