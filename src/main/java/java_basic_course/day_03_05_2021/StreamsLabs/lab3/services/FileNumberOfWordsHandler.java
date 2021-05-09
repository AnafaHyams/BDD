package java_basic_course.day_03_05_2021.StreamsLabs.lab3.services;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class FileNumberOfWordsHandler implements FileHandler {

    // Lab 3a:   Page 123
    @SneakyThrows
    @Override
    public long calculate(String path) {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int countWords = bufferedReader.lines()
                .mapToInt(line -> (int) List.of(line.split(" ")).stream().count())
                .sum();
        return countWords;
    }
}
