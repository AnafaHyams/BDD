package java_basic_course.day_26_04_2021.task2;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ApplicationContext {
    Map<Class,Object> singletonsCacheHandlerMap = new HashMap<Class, Object>();
    private Reflections scanner = new Reflections("java_basic_course.day_26_04_2021.task2");
    Set<Class<?>> typesAnnotatedWith = scanner.getTypesAnnotatedWith(Singleton.class);

    public Object getObject(Class type) {
        Object aClass;
        if(typesAnnotatedWith.contains(type)){
            aClass = handleSingletonAnnotation(type);
        }
        else{
            aClass = ObjectFactory.getInstance().createObject(type);
        }

        return aClass;
    }

    private Object handleSingletonAnnotation(Class type){
        Object aClass;
        aClass = singletonsCacheHandlerMap.get(type);

        if(aClass == null){
            if(type.isInterface()){
                Set<Class<?>> classes = scanner.getSubTypesOf(type);

                if (classes.size() != 1) {
                    throw new IllegalStateException("0 or more than one impl found for type " + type);
                }

                type = classes.iterator().next();
            }

            aClass = ObjectFactory.getInstance().createObject(type);
            singletonsCacheHandlerMap.put(type,aClass);
        }

        return aClass;
    }
}
