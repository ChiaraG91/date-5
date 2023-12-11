import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    public static void main(String[] args) {

        dateComparison();
    }

    public static void dateComparison(){
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data1);
        String firstDate = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("firstDate: " + firstDate);

        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        System.out.println(data2);
        String secondDate = data2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("secondDate: " + secondDate);

        if (data1.isBefore(data2)) {
            System.out.println("firstDate è prima di secondDate");
        }

        if (data2.isAfter(data1)) {
            System.out.println("secondDate è dopo di firstDate");
        }

        if (data1.isEqual(data2)) {
            System.out.println("firstDate è uguale a secondDate");
        } else{
            System.out.println("firstDate non è uguale a secondDate");
        }




    }
}
