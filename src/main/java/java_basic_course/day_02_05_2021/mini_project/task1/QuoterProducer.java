package java_basic_course.day_02_05_2021.mini_project.task1;


import java.util.List;

public class QuoterProducer {
    private int id = 0;

    public Quote getRandomQuote() {
        id++;
        String text = createRandomText();

        return new Quote(id, text, getStatusTextObject(text));
    }

    private Status getStatusTextObject(String text) {
        int textLength = text.length();

        return Status.findByDbCode(textLength);
    }


    private List<String> textSuppliers = List.of(
            "String 1",
            "I'm string 2",
            "Bla bla bla bla bla bla bla.............................."
    );


    private String createRandomText() {
        return RandomUtil.getRandomItem(textSuppliers);
    }
}
