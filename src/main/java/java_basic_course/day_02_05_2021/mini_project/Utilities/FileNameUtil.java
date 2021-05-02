package java_basic_course.day_02_05_2021.mini_project.Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileNameUtil {

    public static String getFileNameFromDate() {
        String dateAndTimeFormat = "yyyy-MM-dd hh-mm-ss";
        LocalDateTime localDateTime= LocalDateTime.now();

        return localDateTime.format(DateTimeFormatter.ofPattern(dateAndTimeFormat));
    }
}
