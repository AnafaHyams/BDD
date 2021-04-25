package java_basic_course.day_25_04_2021.task1;

import java.io.Serializable;

public enum HttpCodes implements Serializable {
    INFORMATIONAL(100, 199, "40 lines of code is working in order to handle informational status"),
    SUCCESS(200, 299, "35 lines of code is working in order to handle success status"),
    REDIRECTION(300, 399, "explanationCodeForRedirection"),
    CLIENT_ERROR(400, 499, "explanation code for client error"),
    SERVER_ERROR(500, 599, "explanation code for server error");

    private final int dbMinCode;
    private final int dbMaxCode;
    private final String explanationCode;

    HttpCodes(int dbMinCode, int dbMaxCode, String explanationCode) {
        this.dbMinCode = dbMinCode;
        this.dbMaxCode = dbMaxCode;
        this.explanationCode = explanationCode;
    }

    public static HttpCodes findByDbCode(int dbCode) throws IllegalStateException {
        HttpCodes[] codes = values();
        for (HttpCodes httpCode : codes) {
            if (httpCode.dbMinCode <= dbCode && httpCode.dbMaxCode >= dbCode) {
                return httpCode;
            }
        }

        throw new IllegalStateException(dbCode + " code not supported");
    }

    public void printExplanationCode() {
        System.out.println(explanationCode);
    }
}