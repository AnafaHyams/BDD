package java_basic_course.day_25_04_2021.task2;

import java.time.format.DateTimeParseException;

public class Main {

    public static void main(String[] args) {
        try {
            long daysBetween = DateHandler.daysBetweenTwoStrings("1980-03-10", "1978-03-10");
            System.out.println("Days between: " + daysBetween);

            String dateInNewFormat = DateHandler.convertFormat("1990-04-28");
            System.out.println("Date in new format: " + dateInNewFormat);
        } catch (DateTimeParseException e) {
            System.out.println("Exception thrown: " + e);
        }
    }
}
