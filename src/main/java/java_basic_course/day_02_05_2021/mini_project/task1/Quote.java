package java_basic_course.day_02_05_2021.mini_project.task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Quote implements Serializable {
    private long id;
    private String text;
    private Status status;
}
