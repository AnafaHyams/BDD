package java_basic_course.day_26_04_2021.task2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Troll {

    @InjectRandomInt(min = 10,max = 20)
    private int power;

}
