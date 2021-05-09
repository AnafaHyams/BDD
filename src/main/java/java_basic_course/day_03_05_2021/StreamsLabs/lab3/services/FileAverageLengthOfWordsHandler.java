package java_basic_course.day_03_05_2021.StreamsLabs.lab3.services;

public class FileAverageLengthOfWordsHandler implements FileHandler {

    // Lab 3b:   Page 123
    @Override
    public long calculate(String path) {
        FileNumberOfWordsHandler fileNumberOfWordsHandler = new FileNumberOfWordsHandler();
        FileNumberOfCharactersHandler fileNumberOfCharactersHandler = new FileNumberOfCharactersHandler();

        long numberOfWords = fileNumberOfWordsHandler.calculate(path);
        long numberOfCharacters = fileNumberOfCharactersHandler.calculate(path);

        if (numberOfWords > 0) {
            return numberOfCharacters/numberOfWords;
        }

        return 0;
    }
}
