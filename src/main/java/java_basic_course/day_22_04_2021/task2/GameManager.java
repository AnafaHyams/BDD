package java_basic_course.day_22_04_2021.task2;

public class GameManager {

    private static int roundNumber = 0;

    public static void fight(Hero h1, Hero h2) {
        while(h1.isAlive() && h2.isAlive()) {
            roundNumber++;
            System.out.println("Round " + roundNumber + ":");

            System.out.println(h1.getClass().getSimpleName() + " kick " + h2.getClass().getSimpleName() + "-");
            h1.kick(h2);
            System.out.println(h2.getClass().getSimpleName() + " kick " + h1.getClass().getSimpleName() + "-");

            System.out.println("--------------------------------------------");
        }

        System.out.println("Game over!");

        if(h1.isAlive()) {
            System.out.println(h1.getClass().getSimpleName() + " win at that fight");
        } else if(h2.isAlive()) {
            System.out.println(h2.getClass().getSimpleName() + " win at that fight");
        } else {
            System.out.println("No one win the game - " + h1.getClass().getSimpleName() + " and " + h2.getClass().getSimpleName() + " are dead :(");
        }
    }
}
