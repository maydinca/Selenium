package C008;

public class _002_BlankEmpty {
    public static void main(String[] args) {
        String blank = " ";
        String empty = " "; // In Java space is considered a character, therefore this is NOT empty
        System.out.println("blank = " + blank.isBlank());
        System.out.println("empty = " + empty.isEmpty());

    }
}

