package java_basic_course.day_02_05_2021.mini_project.Utilities;

import java_basic_course.day_02_05_2021.mini_project.task1.Quote;
import java_basic_course.day_02_05_2021.mini_project.task2.JsonMapper;

public class JsonUtil {
    public static String makeJsonString(Quote quote) {
        String objectAsJson = JsonMapper.convertToJson(quote);
        System.out.println(objectAsJson);

        return objectAsJson;
    }
}
