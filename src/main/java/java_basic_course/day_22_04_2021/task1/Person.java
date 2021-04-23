package java_basic_course.day_22_04_2021.task1;

import lombok.Data;

@Data
public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
