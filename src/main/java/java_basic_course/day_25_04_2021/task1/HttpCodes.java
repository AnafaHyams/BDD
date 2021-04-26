package java_basic_course.day_25_04_2021.task1;

import java.io.Serializable;

public enum HttpCodes implements Serializable {
    INFORMATIONAL(100, 199, new InformationCodeHandler()),
    SUCCESS(200, 299, new SuccessCodeHandlerImpl()),
    REDIRECTION(300, 399, new RedirectionCodeHandlerImpl()),
    CLIENT_ERROR(400, 499, new ClientErrorCodeHandlerImpl()),
    SERVER_ERROR(500, 599, new ServerErrorCodeHandlerImpl());

    private final int dbMinCode;
    private final int dbMaxCode;
    private final CodeHandler codeHandler;

    HttpCodes(int dbMinCode, int dbMaxCode, CodeHandler codeHandler) {
        this.dbMinCode = dbMinCode;
        this.dbMaxCode = dbMaxCode;
        this.codeHandler = codeHandler;
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

    public void doCode() {
        this.codeHandler.codeFunc();
    }
}