
package machine.Stage3;

import java.util.Scanner;

public class coffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int WATER = 200;
        int MILK = 50;
        int BEANS = 15;

        System.out.print("Write how many ml of water the coffee machine has: ");
        int waterLevel = scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milkLevel = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int beanLevel = scanner.nextInt();
    }
}
