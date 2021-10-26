package Sprint_2;

public class Task_6_2 {
    public static void main(String[] args) {

        System.out.println(mathOperations(125, 24, "sum"));
        System.out.println(mathOperations(125, 24, "multiply"));
        System.out.println(mathOperations(125, 24, "subtract"));
        System.out.println(mathOperations(125, 24, "divide"));
    }

    static int mathOperations(int a, int b, String operation) {
        if (operation == "sum") {
            return a + b;
        } else if (operation == "multiply") {
            return a * b;
        } else if (operation == "subtract") {
            return a - b;
        } else if (operation == "divide") {
            return a / b;
        } else {
            return 0;
        }
    }
}
