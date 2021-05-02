package java_basic_course.day_02_05_2021.mini_project.task1;

import java_basic_course.day_02_05_2021.mini_project.Resources.QuotesBucket;
import java_basic_course.day_02_05_2021.mini_project.Utilities.RandomUtil;

public class QuoterProducer {

    public Quote getRandomQuoteObject() {
        long id = System.nanoTime();
        String text = createRandomText();

        return new Quote(id, text, getStatusTextObject(text));
    }

    private Status getStatusTextObject(String text) {
        int textLength = text.length();

        return Status.findByDbCode(textLength);
    }

    private String createRandomText() {
        return RandomUtil.getRandomItem(QuotesBucket.textSuppliers);
    }
}
