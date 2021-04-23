package java_basic_course.day_22_04_2021.task2;

import java.util.Random;

public class RandomDataHero extends Hero {
    @Override
    public void kick(Hero enemy) {
        // Create instance of Random class
        Random random = new Random();

        // Generate random integers in range 1 to his power
        int randDecreaseNum = random.nextInt(this.power + 1);
        System.out.println("I (" + this.getClass().getSimpleName() + ") decrease enemy (" + enemy.getClass().getSimpleName() + ") hp by " + randDecreaseNum);
        enemy.hp -= randDecreaseNum;
        System.out.println("Enemy power = " + enemy.power + "; Enemy hp = " + enemy.hp);
    }
}
