package lesson03;

public class Task01 {
    public static void main(String[] args) {
        Message message1 = new Message();
        Message message2 = new Message();
        Message message3 = new Message("Good buy!");
        Person person = new Person("Ksyusha");
        person.talk("I'm happy!");
        person.move("Bali");
        Robot robot = new Robot(1,2, Robot.Direction.LEFT);
        System.out.println("X = "+ robot.getX()+ " Y = " + robot.getY() + " Направление: " + robot.getDirection());
        robot.stepForward();
        System.out.println("X = "+ robot.getX()+ " Y = " + robot.getY() + " Направление: " + robot.getDirection());
        robot.turnRight();
        robot.stepForward();
        System.out.println("X = "+ robot.getX()+ " Y = " + robot.getY() + " Направление: " + robot.getDirection());
        robot.turnRight();
        robot.stepForward();
        System.out.println("X = "+ robot.getX()+ " Y = " + robot.getY() + " Направление: " + robot.getDirection());
        robot.turnLeft();
        robot.stepForward();
        System.out.println("X = "+ robot.getX()+ " Y = " + robot.getY() + " Направление: " + robot.getDirection());
    }
}
