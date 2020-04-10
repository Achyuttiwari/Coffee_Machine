
package machine.Stage4;

public class coffeeMachine {
    static int water = 1200;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    static Boolean exit = false;

    enum Status {
        CHOOSING, BUYING, FILLING, TAKING, REMAINING, EXITING
    }

}
