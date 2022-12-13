package RecapJava;

public class switchCase {
    public static void main(String[] args) {

        int day = 2;
        String dayType  = switch(day) {
            case 1, 2, 3, 4, 5 -> "Working day";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(dayType);
    }
}

