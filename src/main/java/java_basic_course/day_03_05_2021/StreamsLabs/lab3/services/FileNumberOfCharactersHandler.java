package java_basic_course.day_03_05_2021.StreamsLabs.lab3.services;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class FileNumberOfCharactersHandler implements FileHandler {
    @SneakyThrows
    @Override
    public long calculate(String path) {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        long numOfChars = bufferedReader.lines()
                .flatMap(line -> List.of(line.split(" ")).stream())
                .mapToLong(word -> word.length())
                .sum();

        return numOfChars;
    }
}
