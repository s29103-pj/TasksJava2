import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Wciśni klawisze od A do Z: ");
        char key = (char) System.in.read();

        if (key >= 'A' && key <= 'Z') {
            System.out.println("Dobrze!");
        } else {
            System.out.println("Zle!");
            System.out.println("Poprawny klawisz to: " + (char) ('A' + (int) (Math.random() * 26)));
        }
    }
}
