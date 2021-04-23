package java_basic_course.day_20_04_2021.task2;

public class LetsWriteSomeCode {

    public static void main(String[] args) {

        double[] arrOfDoubles = {5.3, 4.56, 3.2145, 2.0, 3.9, 5.0235};
        int[] arrOfInts = new int[arrOfDoubles.length];

        // round to down
        for (int i = 0; i < arrOfDoubles.length; i++) {
            arrOfInts[i] = (int) arrOfDoubles[i];
        }


        // print arr of ints (to check my solution)
        for (int i = 0; i < arrOfInts.length; i++) {
            System.out.println(arrOfInts[i]);
        }
    }
}
