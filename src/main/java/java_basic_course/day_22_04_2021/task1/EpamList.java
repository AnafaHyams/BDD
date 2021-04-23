package java_basic_course.day_22_04_2021.task1;

//todo you can use only array []
public interface EpamList<E> {
    void add(E o);

    int size();

    boolean remove(int i);

    //bonus
    boolean remove(E o);

    E get(int index);

    void printAllContext();
}
