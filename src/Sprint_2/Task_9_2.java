package Sprint_2;

public class Task_9_2 {
    public static void main(String[] args) {
        String word = "hello";
        String a ="";
        char[] word1 = word.toCharArray();

        for (char c : word1) {
            a += Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
        }

        System.out.println(a);

    }
}
