import java.time.LocalDate;
import java.time.ZoneId;

public class DaysFromNow {

    public static LocalDate calculateHundredDaysFromNow(LocalDate today) {
        return today.plusDays(100);
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(ZoneId.of("Europe/London"));
        System.out.println("100 days from now is... " + calculateHundredDaysFromNow(today));
    }

}
