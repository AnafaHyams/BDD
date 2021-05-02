package java_basic_course.day_02_05_2021.mini_project.task1;

import java.io.Serializable;

public enum Status implements Serializable {
    SHORT(1, 10, "Short"),
    MEDIUM(11, 20, "Medium"),
    LONG(21, Integer.MAX_VALUE, "Long");

    private final int dbMinCode;
    private final int dbMaxCode;
    private final String statusDesc;

    Status(int dbMinCode, int dbMaxCode, String statusDesc) {
        this.dbMinCode = dbMinCode;
        this.dbMaxCode = dbMaxCode;
        this.statusDesc = statusDesc;
    }

    public static Status findByDbCode(int dbCode) throws IllegalStateException {
        Status[] status = values();
        for (Status statusLength : status) {
            if (statusLength.dbMinCode <= dbCode && statusLength.dbMaxCode >= dbCode) {
                return statusLength;
            }
        }

        throw new IllegalStateException(dbCode + " code not supported");
    }
}
