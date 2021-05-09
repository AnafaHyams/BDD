package java_basic_course.day_03_05_2021.StreamsLabs.lab3;

import java_basic_course.day_03_05_2021.StreamsLabs.lab3.services.FileHandler;
import java_basic_course.day_03_05_2021.StreamsLabs.lab3.services.FileNumberOfWordsHandler;

public class Main {
    public static void main(String[] args) {
        FileHandler fileNumberOfWords = new FileNumberOfWordsHandler();

        long wordsCountInFile = fileNumberOfWords.calculate("C:\\tmp\\streams_task\\text_file.txt");
        System.out.println("Page 123 (lab3a): There are " + wordsCountInFile + " words at the given file");
    }

}
