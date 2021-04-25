package java_basic_course.day_25_04_2021.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DateHandler {

    public static long daysBetweenTwoStrings(String date1AsString, String date2AsString) throws DateTimeParseException {
        LocalDate localDate1 = getLocalDate(date1AsString);
        LocalDate localDate2 = getLocalDate(date2AsString);

        long between = ChronoUnit.DAYS.between(localDate1, localDate2);

        return Math.abs(between);
    }

    public static String convertFormat(String date) throws DateTimeParseException {
        LocalDate localDate = getLocalDate(date);

        return localDate.format(DateTimeFormatter.ofPattern("yy-MM-dd"));
    }

    private static LocalDate getLocalDate(String dateAsString) throws DateTimeParseException {
        return LocalDate.parse(dateAsString);
    }
}
