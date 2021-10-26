package Sprint_2;

import java.util.Scanner;

public class Task_6_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите секунды");
        int hours = in.nextInt();
        int h1 = hours / 3600;
        int h2 = hours / 60;
        System.out.println(h1% 24);
        System.out.println(h2% 60);
        System.out.println(hours% 60);


    }
}
