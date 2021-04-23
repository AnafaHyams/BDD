package java_basic_course.day_21_04_2021.task2;

public class EpamListImpl implements EpamList {
    private Object[] objectsList;

    @Override
    public void add(Object o) {
        int arraySize = size();

        objectsList = createListWithNewSizeAndOldData(arraySize + 1);
        objectsList[arraySize] = o;
    }

    @Override
    public int size() {
        if(objectsList != null) {
            return objectsList.length;
        }

        return 0;
    }

    @Override
    public boolean remove(int i) {
        boolean isSucceeded = false;

        if(isIndexExist(i)) {
            objectsList = createListWithoutObjectWithIndex(i);
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
    public Object get(int index) {
        if(isIndexExist(index)){
            return objectsList[index];
        } else {
            return null;
        }
    }

    @Override
    public void printAllContext() {
        int size = size();

        if(size != 0) {
            System.out.println("List context: ");

            for (int i = 0; i < size; i++) {
                System.out.println("index " + i + " in your list is: " + objectsList[i]);
            }
        } else {
            System.out.println("List is empty!");
        }
    }


    // using for method 'add'
    private Object[] createListWithNewSizeAndOldData(int arrayNewSize) {
        Object[] newObjectsList = new Object[arrayNewSize];

        for(int i = 0; i < arrayNewSize - 1; i++) {
            newObjectsList[i] = objectsList[i];
        }

        return newObjectsList;
    }

    // using for method 'remove(int i)'
    private Object[] createListWithoutObjectWithIndex(int indexToDelete) {

        int newSize = size() - 1;
        Object[] newObjectsList = new Object[newSize];
        int i;

        for(i = 0; i < indexToDelete; i++) {
            newObjectsList[i] = objectsList[i];
        }

        for(i = indexToDelete + 1; i <= newSize; i++) {
            newObjectsList[i - 1] = objectsList[i];
        }

        return newObjectsList;
    }


    // using for method 'remove(Object o)'
    private int findIndexOfGivenObject(Object o) {

        for(int i = 0; i < size(); i++) {
            if(objectsList[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }

    // using for method 'get' and 'remove(int i)'
    private boolean isIndexExist(int index) {
        return index >= 0 && index < size();
    }
}
