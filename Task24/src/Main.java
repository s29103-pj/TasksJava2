import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 string: ");
        String string1 = scan.nextLine();

        System.out.println("2 string: ");
        String string2 = scan.nextLine();

        if (string1.equals(string2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}