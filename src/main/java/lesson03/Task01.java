package lesson03;

public class Task01 {
    public static void main(String[] args) {
        Message message1 = new Message();
        Message message2 = new Message();
        Message message3 = new Message("Good buy!");
        Person person = new Person("Ksyusha");
        person.talk("I'm happy!");
        person.move("Bali");
        //Задание 4
        Robot robot = new Robot(1, 2, Robot.Direction.LEFT);
        System.out.println("X = " + robot.getX() + " Y = " + robot.getY() + " Направление: " + robot.getDirection());
        robot.stepForward();
        System.out.println("X = " + robot.getX() + " Y = " + robot.getY() + " Направление: " + robot.getDirection());
        robot.turnRight();
        robot.stepForward();
        System.out.println("X = " + robot.getX() + " Y = " + robot.getY() + " Направление: " + robot.getDirection());
        robot.turnRight();
        robot.stepForward();
        System.out.println("X = " + robot.getX() + " Y = " + robot.getY() + " Направление: " + robot.getDirection());
        robot.turnLeft();
        robot.stepForward();
        System.out.println("X = " + robot.getX() + " Y = " + robot.getY() + " Направление: " + robot.getDirection());
        //Задание 5
        Robot robot2 = new Robot(5, 5, Robot.Direction.LEFT);
        System.out.println("X = " + robot2.getX() + " Y = " + robot2.getY());
        moveRobot(robot2, 0, -3);
        System.out.println("X = " + robot2.getX() + " Y = " + robot2.getY());
    }

    private static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                if (robot.getDirection() == Robot.Direction.LEFT) {
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Robot.Direction.RIGHT) {
                    robot.stepForward();
                } else if (robot.getDirection() == Robot.Direction.UP) {
                    robot.turnRight();
                    robot.stepForward();
                } else {
                    robot.turnLeft();
                    robot.stepForward();
                }
            } else if (robot.getX() > toX) {
                if (robot.getDirection() == Robot.Direction.LEFT) {
                    robot.stepForward();
                } else if (robot.getDirection() == Robot.Direction.RIGHT) {
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Robot.Direction.UP) {
                    robot.turnLeft();
                    robot.stepForward();
                } else {
                    robot.turnRight();
                    robot.stepForward();
                }
            } else {
                break;
            }
        }
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                if (robot.getDirection() == Robot.Direction.LEFT) {
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Robot.Direction.RIGHT) {
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Robot.Direction.UP) {
                    robot.stepForward();
                } else {
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                }
            } else if (robot.getY() > toY) {
                if (robot.getDirection() == Robot.Direction.LEFT) {
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Robot.Direction.RIGHT) {
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Robot.Direction.UP) {
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                } else {
                    robot.stepForward();
                }
            } else {
                break;
            }
        }

    }
}
