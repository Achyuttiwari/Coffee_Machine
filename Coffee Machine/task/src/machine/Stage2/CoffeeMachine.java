
package machine.Stage2;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //amount of each ingredients per 1 cup

        int WATER = 200;
        int MILK = 50;
        int BEANS = 15;

        System.out.print("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need: ");
        System.out.println((cups * WATER) + " ml of water");
    }
}
