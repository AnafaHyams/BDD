package java_basic_course.day_25_04_2021.task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HttpCodeHandler {

    private HttpCodes httpCodes;

    public void handleHttpCode(int httpCode) {

        try {
            System.out.println("For Http code " + httpCode + ":");
            HttpCodes.findByDbCode(httpCode).doCode();
        } catch (IllegalStateException e) {
            System.out.println(e);
        }

    }
}
