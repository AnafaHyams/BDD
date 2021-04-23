package java_basic_course.day_22_04_2021.task1;

public class Main {
    public static void main(String[] args) {

        EpamList epamList = new GenericEpamListImpl();

        System.out.println("Size at start: " + epamList.size());

        System.out.println("--------------------------------------");

        epamList.add("Java");
        epamList.add("Scala");
        epamList.printAllContext();
        System.out.println("Size after adding 2 elements: " + epamList.size());
        System.out.println("get(1): " + epamList.get(1));
        System.out.println("get(3): " + epamList.get(-5)); //null

        System.out.println("--------------------------------------");

        epamList.add("C++");
        epamList.add("C");
        epamList.add("C#");
        epamList.add("Python");
        epamList.add("js");
        System.out.println("Size after adding 5 more elements: " + epamList.size());
        epamList.printAllContext();
        System.out.println("Is method remove(3) succeeded: " + epamList.remove(3));
        System.out.println("Size after remove index 3: " + epamList.size());
        epamList.printAllContext();

        System.out.println("--------------------------------------");
        System.out.println("Is method remove(\"Angular\") succeeded: " + epamList.remove("Angular"));
        System.out.println("--------------------------------------");
        System.out.println("Is method remove(\"Python\") succeeded: " + epamList.remove("Python"));
        System.out.println("Size after remove object(String) \"Python\": " + epamList.size());
        epamList.printAllContext();
        System.out.println("--------------------------------------");
        System.out.println("Is method remove(\"js\") succeeded: " + epamList.remove("js"));
        System.out.println("Size after remove object(String) \"js\": " + epamList.size());
        epamList.printAllContext();
        System.out.println("--------------------------------------");
        System.out.println("Is method remove(\"Java\") succeeded: " + epamList.remove("Java"));
        System.out.println("Size after remove object(String) \"Java\": " + epamList.size());
        epamList.printAllContext();


        System.out.println("--------------------------------------");
        epamList.add(1);
        epamList.add(3);
        epamList.add(new Person("Anafa", 30));
        epamList.printAllContext();
        System.out.println("Size after adding 2 more elements (int): " + epamList.size());
        System.out.println("get(1): " + epamList.get(1));
        System.out.println("get(4): " + epamList.get(4));
        System.out.println("get(epamList.size() - 1): " + epamList.get(epamList.size() - 1));
    }
}
