package java_basic_course.day_25_04_2021.task1;

public class Main {
    public static void main(String[] args) {
        HttpCodeHandler httpCodeHandler = new HttpCodeHandler();

        httpCodeHandler.handleHttpCode(0);

        System.out.println("------------------------------------------");

        httpCodeHandler.handleHttpCode(100);
        httpCodeHandler.handleHttpCode(150);
        httpCodeHandler.handleHttpCode(199);

        System.out.println("------------------------------------------");

        httpCodeHandler.handleHttpCode(200);
        httpCodeHandler.handleHttpCode(259);
        httpCodeHandler.handleHttpCode(299);

        System.out.println("------------------------------------------");

        httpCodeHandler.handleHttpCode(300);
        httpCodeHandler.handleHttpCode(333);
        httpCodeHandler.handleHttpCode(399);

        System.out.println("------------------------------------------");

        httpCodeHandler.handleHttpCode(400);
        httpCodeHandler.handleHttpCode(456);
        httpCodeHandler.handleHttpCode(499);

        System.out.println("------------------------------------------");

        httpCodeHandler.handleHttpCode(500);
        httpCodeHandler.handleHttpCode(588);
        httpCodeHandler.handleHttpCode(599);

        System.out.println("------------------------------------------");

        httpCodeHandler.handleHttpCode(1000);

    }
}
