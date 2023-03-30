public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;


        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s\n", "A", "B", "AND", "OR", "XOR", "NOT");
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s\n", a, b, a && b, a || b, !(a && b), !(a || b));
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s\n", a, a, a && a, a || a, !(a && a), !(a || a));
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s\n", b, b, b && b, b || b, !(b && b), !(b || b));
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s\n", a, !b, a && !b, a || !b, !(a && !b), !(a || !b));
    }
}