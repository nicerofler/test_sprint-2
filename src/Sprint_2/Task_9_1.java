package Sprint_2;

public class Task_9_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4,5 ,56, 60};
        double a = 0;

        for(double b : array){
            a += b;
        }
        System.out.println("Среднее арифметическое " + a / array.length);
    }
}
