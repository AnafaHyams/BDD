package java_basic_course.day_02_05_2021.mini_project.task1;

import java_basic_course.day_02_05_2021.mini_project.Utilities.RandomUtil;

import java.util.List;

public class QuoterProducer {

    public Quote getRandomQuote() {
        long id = System.nanoTime();
        String text = createRandomText();

        return new Quote(id, text, getStatusTextObject(text));
    }

    private Status getStatusTextObject(String text) {
        int textLength = text.length();

        return Status.findByDbCode(textLength);
    }


    private List<String> textSuppliers = List.of(
            "The future belongs to those who believe in the beauty of their dreams",
            "The way to get started is to quit talking and begin doing",
            "Your time is limited, so don't waste it living someone else's life",
            "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough",
            "Life is what happens when you're busy making other plans"
    );


    private String createRandomText() {
        return RandomUtil.getRandomItem(textSuppliers);
    }
}
