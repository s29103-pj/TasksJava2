public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        double w = 33.5;
        double z = 17.3;
        System.out.println("Inkrementacja i dekrementacja:");
        System.out.println("++  inkrementacja");
        System.out.println("--  dekrementacja");

        System.out.println("Operatory arytmetyczne:");
        System.out.println("+  dodawanie");
        System.out.println("-  odejmowanie");
        System.out.println("*  mnożenie");
        System.out.println("/  dzielenie");
        System.out.println("%  modul");

        System.out.println("Operatory relacyjne:");
        System.out.println("==  równy");
        System.out.println("!=  nierówny");
        System.out.println(">  większy");
        System.out.println("<  mniejszy");
        System.out.println(">=  większy lub równy");
        System.out.println("<=  mniejszy lub równy");

        System.out.println("Inkrementacja i dekrementacja:");
        System.out.println("x = " + x);
        x++;
        System.out.println("x++ = " + x);
        System.out.println("y = " + y);
        y--;
        System.out.println("y-- = " + y);

        System.out.println("Operatory arytmetyczne:");
        System.out.println("w + z = " + (w + z));
        System.out.println("w - z = " + (w - z));
        System.out.printf("w * z = %.2f%n", (w * z));
        System.out.printf("w / z = %.5f%n", (w / z));
        System.out.println("w % z = " + (w % z));

        System.out.println("Operatory relacyjne:");
        boolean equals = x == y;
        System.out.println("x == y: " + equals);
        boolean notEquals = x != y;
        System.out.println("x != y: " + notEquals);
        boolean greaterThan = x > y;
        System.out.println("x > y: " + greaterThan);
        boolean lessThan = x < y;
        System.out.println("x < y: " + lessThan);
        boolean greaterOrEqual = x >= y;
        System.out.println("x >= y: " + greaterOrEqual);
        boolean lessOrEqual = x <= y;
        System.out.println("x <= y: " + lessOrEqual);
    }
}