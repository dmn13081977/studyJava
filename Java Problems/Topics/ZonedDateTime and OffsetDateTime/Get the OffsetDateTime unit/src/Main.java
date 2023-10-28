import java.util.Scanner;
import java.time.*;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OffsetDateTime offsetDateTime = convertToOffsetDateTime(scanner.nextLong(), ZoneId.of("Asia/Yerevan"));

        System.out.println(offsetDateTime);
    } 

    public static OffsetDateTime convertToOffsetDateTime(long epochSeconds, ZoneId zoneId) {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(epochSeconds), zoneId);
    }
}