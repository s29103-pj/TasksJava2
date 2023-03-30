import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String name = scan.nextLine();

        System.out.print("Podaj nazwisko: ");
        String surname = scan.nextLine();

        System.out.print("Podaj grupę: ");
        String group = scan.nextLine();

        System.out.print("Podaj kierunek studiów: ");
        String faculty = scan.nextLine();

        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Grupa: " + group);
        System.out.println("Kierunek studiów: " + faculty);
    }
}