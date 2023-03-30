import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj promien walca: ");
        double rad = input.nextDouble();

        System.out.print("Podaj wysokosc walca: ");
        double height = input.nextDouble();

        double result = (Math.PI * (rad * rad) * height);
        System.out.printf("Pojemnosc walca wynosi: %.2f", result);
    }
}