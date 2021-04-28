package java_basic_course.day_26_04_2021.task2;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext context = new ApplicationContext();

        IRobot iRobot = (IRobot) context.getObject(IRobot.class);
        IRobot iRobot2 = (IRobot) context.getObject(IRobotImpl.class);

        Speaker s1 = (Speaker) context.getObject(PopupSpeaker.class);

        System.out.println(context.singletonsCacheHandlerMap);
        iRobot.cleanRoom();
        iRobot2.cleanRoom();
    }
}
