package java_basic_course.day_21_04_2021.task2;

public class Main {
    public static void main(String[] args) {
        EpamListImpl epamList = new EpamListImpl();

        // size of list before initialization
        System.out.println("Size of list is: " + epamList.size());
        epamList.size();
        epamList.printAllContext();

        // add object to list
        epamList.add(new Object());

        // size after adding one element (object) to the list implementation
        System.out.println("Size of list after adding 1 object is: " + epamList.size());
        epamList.printAllContext();
        System.out.println("get(0) function result: " + epamList.get(0));
        System.out.println("get(-5) function result: " + epamList.get(-5));

        epamList.add(new Object());
        System.out.println("Size of list after adding 2 objects is: " + epamList.size());
        epamList.printAllContext();
        System.out.println("get(0) function result: " + epamList.get(0));
        System.out.println("get(1) function result: " + epamList.get(1));
        System.out.println("get(3) function result: " + epamList.get(3));

        Object object4 = new Object();

        epamList.add(new Object());
        epamList.add(object4);
        epamList.add(new Object());

        System.out.println("get(3) function result (will be deleted as object): " + epamList.get(3));

        System.out.println("remove(0) function result: " + epamList.remove(0));
        System.out.println("Size of list after removing 1 objects is: " + epamList.size());
        epamList.printAllContext();
        System.out.println("get(0) function result: " + epamList.get(0));
        System.out.println("get(1) function result: " + epamList.get(1));


        System.out.println("remove (object object4) function result: " + epamList.remove(object4));
        System.out.println("Size of list after removing object is: " + epamList.size());
        epamList.printAllContext();
    }
}
