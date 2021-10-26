package Sprint_2;

import java.util.Scanner;

public class Task_6_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дистанцию");
        int distance = in.nextInt();
        int m = distance / 100;
        System.out.println(m);
    }
}
