package java_basic_course.day_02_05_2021.mini_project.task1;

import java_basic_course.day_02_05_2021.mini_project.Utilities.FileNameUtil;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;


public class WriteToFolderHandler {

    private static String dirPath;
    private static String endFilePathFormat;

    @SneakyThrows
    public static void writeObject(Object quote, String dir, String endFileFormat){
        setPaths(dir,endFileFormat);
        createDirectory();
        makeFileHandler(quote);
    }

    private static void setPaths(String dir, String endFileFormat) {
        dirPath = dir;
        endFilePathFormat = endFileFormat;
    }

    private static void createDirectory() {
        File dir = new File(dirPath);

        if (!dir.exists()){
            dir.mkdirs();
        }
    }

    private static void makeFileHandler(Object quote) throws IOException {
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
        String fileName = FileNameUtil.getFileNameFromDate();

        return dirPath + "\\" + fileName + endFilePathFormat;
    }

    private static void writeToFile(Object quote, File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        List<Object> list = List.of(quote);
        oos.writeObject(list);

        fos.close();
        oos.close();
    }
}
