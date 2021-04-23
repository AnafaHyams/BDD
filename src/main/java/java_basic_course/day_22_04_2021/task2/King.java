package java_basic_course.day_22_04_2021.task2;

import lombok.Data;

import java.util.Random;

@Data
public class King extends RandomDataHero {
    public King() {
        // Create instance of Random class
        Random random = new Random();

        // Generate random integers in range 5 to 15
        this.power = random.nextInt(10) + 5;
        this.hp = random.nextInt(10) + 5;
    }
}
