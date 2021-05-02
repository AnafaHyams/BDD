package java_basic_course.day_02_05_2021.mini_project.task1;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class WriteToFolderHandler {

    private static final String DIR_PATH = "c:\\mini_project_files";
    private static final String END_FILE_PATH_FORMAT = ".txt";

    @SneakyThrows
    public static void writeObject(Quote quote){
        createDirectory();
        makeFileHandler(quote);
    }

    private static void createDirectory() {
        File dir = new File(DIR_PATH);

        if (!dir.exists()){
            dir.mkdirs();
        }
    }

    private static void makeFileHandler(Quote quote) throws IOException {
        File file = getCreatedFile();
        writeToFile(quote, file);
    }

    private static File getCreatedFile() throws IOException {
        String filePath = createFilePath();
        File file = new File(filePath);
        file.createNewFile();

        return file;
    }

    private static String createFilePath() {
        String fileName = getFileNameFromDate();
        return DIR_PATH + "\\" + fileName + END_FILE_PATH_FORMAT;
    }

    private static void writeToFile(Quote quote, File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        List<Object> list = List.of(quote);
        oos.writeObject(list);

        try {
            oos.close();
        } catch (IOException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static String getFileNameFromDate() {
        String dateAndTimeFormat = "yyyy-MM-dd hh-mm-ss";
        LocalDateTime localDateTime= LocalDateTime.now();

        return localDateTime.format(DateTimeFormatter.ofPattern(dateAndTimeFormat));
    }
}
