package java_basic_course.day_22_04_2021.task1;


public class GenericEpamListImpl<E> implements EpamList<E> {

    private Object[] content = new Object[0];

    @Override
    public void add(E o) {

        Object[] objects = new Object[content.length + 1];

        System.arraycopy(content, 0, objects, 0, content.length);
        objects[content.length] = o;
        content = objects;

    }

    @Override
    public int size() {
        return content.length;
    }

    @Override
    public boolean remove(int i) {
        boolean isSucceeded = false;

        if(isIndexExist(i)) {
            Object[] objects = new Object[content.length - 1];

            System.arraycopy(content, 0, objects, 0, i);
            System.arraycopy(content, i + 1, objects, i, content.length - i - 1);

            content = objects;
            isSucceeded = true;
        }

        return isSucceeded;
    }

    @Override
    public boolean remove(Object o) {
        int index = findIndexOfGivenObject(o);
        boolean isSucceeded = false;

        if(index != -1) {
            isSucceeded = remove(index);
        }

        return isSucceeded;
    }

    @Override
    public E get(int index) {
        if(isIndexExist(index)){
            return (E) content[index];
        } else {
            return null;
        }
    }

    @Override
    public void printAllContext() {

        if(content.length != 0) {
            System.out.println("List context: ");

            for (int i = 0; i < content.length; i++) {
                System.out.println("index " + i + " in your list is: " + content[i]);
            }
        } else {
            System.out.println("List is empty!");
        }
    }

    // using for method 'get' and 'remove(int i)'
    private boolean isIndexExist(int index) {
        return index >= 0 && index < size();
    }

    // using for method 'remove(Object o)'
    private int findIndexOfGivenObject(Object o) {

        for(int i = 0; i < size(); i++) {
            if(content[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }
}