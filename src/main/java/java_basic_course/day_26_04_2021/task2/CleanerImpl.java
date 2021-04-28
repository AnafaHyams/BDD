package java_basic_course.day_26_04_2021.task2;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 3,max = 7)
    private int repeat;

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVVVvvvvvvvvvvvvvvvvvvvvvvv");
        }
    }
}
