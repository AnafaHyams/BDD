package java_basic_course.day_22_04_2021.task2;

import lombok.Data;

@Data
public class Elf extends Hero {
    public Elf() {
        this.power = 10;
        this.hp = 10;
    }

    @Override
    public void kick(Hero enemy) {
        if(this.power > enemy.power) {
            System.out.println("Enemy (" + enemy.getClass().getSimpleName() + ") is weaker than me (Elf) so I kill my enemy (" + enemy.getClass().getSimpleName() + ")");
            enemy.hp = 0;
        } else {
            System.out.println("Enemy (" + enemy.getClass().getSimpleName() + ") is NOT weaker than me (Elf) so I decrease his power by 1");
            enemy.power--;
        }

        System.out.println("Enemy power = " + enemy.power + "; Enemy hp = " + enemy.hp);
    }
}
