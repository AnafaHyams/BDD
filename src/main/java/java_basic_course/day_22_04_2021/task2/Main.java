package java_basic_course.day_22_04_2021.task2;

public class Main {
    public static void main(String[] args) {
        Hero h1 = HeroFactory.createHero();
        Hero h2 = HeroFactory.createHero();

        printDataSeparateLine();
        printHeroData(h1);
        printHeroData(h2);

        GameManager.fight(h1,h2);
    }

    private static void printHeroData(Hero hero) {
        System.out.println("Hero: " + hero.getClass().getSimpleName());
        System.out.println("\tPower = " + hero.power);
        System.out.println("\tHP = " + hero.hp);
        printDataSeparateLine();
    }

    private static void printDataSeparateLine() {
        System.out.println("****************************");
    }
}
