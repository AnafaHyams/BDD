package java_basic_course.day_02_05_2021.mini_project.task2;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.StringJoiner;

public class JsonMapper {

    @SneakyThrows
    public static String convertToJson(Object object) {

        StringJoiner sj = new StringJoiner(",", "{", "}");
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            String fieldName = field.getName();
            field.setAccessible(true);
            String valueAsString = field.get(object).toString();

            String leftSide = "\"" + fieldName + "\"";
            String rightSide = valueAsString;

            StringJoiner sjPair = new StringJoiner(":");
            sjPair.add(leftSide);

            if (field.getType().equals(String.class)) {
                sj.add("\"").add(rightSide).add("\"");
            } else {
                sjPair.add(rightSide);
            }

            sj.add(sjPair.toString());
        }

        return sj.toString();
    }
}
