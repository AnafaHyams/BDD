package java_basic_course.day_02_05_2021.mini_project.consumer;

import java_basic_course.day_02_05_2021.mini_project.utilities.ConstUtilities;
import java_basic_course.day_02_05_2021.mini_project.utilities.JsonUtil;
import java_basic_course.day_02_05_2021.mini_project.producer.Quote;
import java_basic_course.day_02_05_2021.mini_project.producer.WriteToFolderHandler;

import lombok.SneakyThrows;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Consumer {

    @SneakyThrows
    public static void main(String[] args) {
        List<Quote> quotesList = ReadFromFolderHandler.readObjects();

        for (Quote quote : quotesList) {
            String objectAsJson = JsonUtil.makeJsonString(quote);

            //writeJsonFileToDir();
            WriteToFolderHandler.writeObject(objectAsJson, ConstUtilities.TARGET_JSON_DIR_PATH, ConstUtilities.END_JSON_FILE_PATH_FORMAT);

            delayXSec();
        }

    }

    private static void delayXSec() throws InterruptedException {
        TimeUnit.SECONDS.sleep(ConstUtilities.DELAY_TIME_IN_SECONDS);
    }
}
