package java_basic_course.day_26_04_2021.task1;

import lombok.SneakyThrows;

import java.lang.reflect.Method;

public class TestRunner {

    @SneakyThrows
    public void runAllTestsOfClass(String className) {
        Class<?> aClass = Class.forName(className);
        Method[] methods = aClass.getDeclaredMethods();
        boolean isThereTestsInClass = false;

        for (Method method : methods) {
            if(method.getName().startsWith("before")) {
                method.invoke(aClass.getDeclaredConstructor().newInstance());
            }
        }

        for(Method method : methods) {
            if(method.getName().startsWith("test")) {
                isThereTestsInClass = true;
                method.invoke(aClass.getDeclaredConstructor().newInstance());
            }
        }

        if (!isThereTestsInClass) {
            System.out.println("There is no tests for this class");
        }
    }
}