package java_basic_course.day_02_05_2021.mini_project.utilities;

import java_basic_course.day_02_05_2021.mini_project.producer.Quote;
import java_basic_course.day_02_05_2021.mini_project.consumer.JsonMapper;

public class JsonUtil {
    public static String makeJsonString(Quote quote) {
        String objectAsJson = JsonMapper.convertToJson(quote);
        System.out.println(objectAsJson);

        return objectAsJson;
    }
}
