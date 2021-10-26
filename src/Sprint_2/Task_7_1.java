package Sprint_2;

import java.util.Scanner;

public class Task_7_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = in.nextInt();
        System.out.println("Введите второе число");
        int y = in.nextInt();
        System.out.println("Введите третье число");
        int z = in.nextInt();
        System.out.println("Максимальное число равно " + Math.max(x,(Math.max(y, z))));
    }
}
