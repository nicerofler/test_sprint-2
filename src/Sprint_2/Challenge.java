package Sprint_2;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(reverseCase("Happy birthday"));

    }
    public static String reverseCase(String str) {
        StringBuilder x = new StringBuilder();
        char[] array = str.toCharArray();
        for (char c : array) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            x.append(c);

        }
        return x.toString();
    }
}
