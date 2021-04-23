package java_basic_course.day_21_04_2021.task2;

/**
 * @author Evgeny Borisov
 */


//todo you can use only array []
public interface EpamList {
    void add(Object o);
    int size();

    boolean remove(int i);


    //bonus
    boolean remove(Object o);

    Object get(int index);


    void printAllContext();
}
