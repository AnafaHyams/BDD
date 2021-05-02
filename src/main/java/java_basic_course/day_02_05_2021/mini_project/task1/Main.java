package java_basic_course.day_02_05_2021.mini_project.task1;

import java_basic_course.day_02_05_2021.mini_project.Utilities.ConstUtilities;

public class Main {
    public static void main(String[] args) {
        QuoterProducer quoterProducer = new QuoterProducer();

        Quote quote = quoterProducer.getRandomQuote();
        System.out.println(quote);
        WriteToFolderHandler.writeObject(quote, ConstUtilities.OBJECTS_DIR_PATH, ConstUtilities.END_TXT_FILE_PATH_FORMAT);
    }
}
