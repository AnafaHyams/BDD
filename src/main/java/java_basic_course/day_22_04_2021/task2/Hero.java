package java_basic_course.day_22_04_2021.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public abstract class Hero {
    int power;
    int hp;

    public abstract void kick(Hero enemy);

    public boolean isAlive() {
        return hp > 0;
    }
}
