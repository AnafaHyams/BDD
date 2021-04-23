package java_basic_course.day_22_04_2021.task2;

import lombok.Data;

@Data
public class Hobbit extends Hero{
    public Hobbit() {
        this.power = 0;
        this.hp = 3;
    }

    @Override
    public void kick(Hero enemy) {
        toCry();
    }

    private void toCry() {
        System.out.println("I'm crying because I have no power :( ");
    }
}
