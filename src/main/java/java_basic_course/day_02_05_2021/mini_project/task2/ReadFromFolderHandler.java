package java_basic_course.day_02_05_2021.mini_project.task2;
import java_basic_course.day_02_05_2021.mini_project.task1.ConstUtilities;
import java_basic_course.day_02_05_2021.mini_project.task1.Quote;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFolderHandler {

    @SneakyThrows
    public static List<Quote> readObjects(){
        File dir = new File(ConstUtilities.OBJECTS_DIR_PATH);
        List<Quote> quotesList = new ArrayList<>();

        if (dir.exists()){
            if(dir.isDirectory()) {
                File[] files = dir.listFiles();

                for(File file : files) {
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream oos = new ObjectInputStream(fis);


                    List listOfObjects = (List) oos.readObject();

                    Object object = listOfObjects.get(0);
                    //for (Object object : listOfObjects) {
                        if (object instanceof Quote) {
                            Quote quote = (Quote) object;
                            System.out.println(quote);

                            quotesList.add(quote);

                        }
                   // }

                }
            }
        }

        return quotesList;
    }

}
