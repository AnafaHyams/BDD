package java_basic_course.day_02_05_2021.mini_project.task1;

import java.util.List;
import java.util.Random;

public class RandomUtil {

    private static Random random = new Random();

    public static <T>  T getRandomItem(List<T> list) {
        int i = getNumberBetween(0, list.size()) - 1;
        return list.get(i);
    }


    public static int getNumberBetween(int min, int max) {
        return random.nextInt(max - min) + min + 1;
    }
}
