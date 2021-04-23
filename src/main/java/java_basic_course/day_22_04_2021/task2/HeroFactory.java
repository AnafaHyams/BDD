package java_basic_course.day_22_04_2021.task2;

import java.util.Random;

public class HeroFactory {

    public static Hero createHero() {
        Random random = new Random();

        int randNumOfHeroToCreate = random.nextInt(4) + 1;

        switch(randNumOfHeroToCreate) {
            case 1: return new Hobbit();
            case 2: return new Elf();
            case 3: return new King();
            case 4: return new Knight();
        }

        return null;
    }
}
