public class Main {
    public static void main(String[] args) {
        int[][] table = {{0, 10, 20}, {1, 11, 21}, {2, 12, 22}};

        System.out.println("Table:");
        tableOutput(table);

        int[][] transposedTable = tableChange(table);

        System.out.println("New Table:");
        tableOutput(transposedTable);
    }


    public static void tableOutput(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static int[][] tableChange(int[][] table) {
        int[][] transposedTable = new int[table[0].length][table.length];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                transposedTable[j][i] = table[i][j];
            }
        }

        return transposedTable;
    }
}
