package java_basic_course.day_22_04_2021.task2;

import lombok.Data;

import java.util.Random;

@Data
public class Knight extends RandomDataHero {

    public Knight() {
        // Create instance of Random class
        Random random = new Random();

        // Generate random integers in range 2 to 12
        this.power = random.nextInt(10) + 2;
        this.hp = random.nextInt(10) + 2;
    }
}
