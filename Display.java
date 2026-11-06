public class Display {

    public void show(int[][] a, int[] r, int[] c, String d) {

        System.out.println("\nYour 2D Array:\n");

        // Display array and row sums
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println("| " + r[i]);
        }

        // Line
        for (int i = 0; i < a[0].length; i++) {
            System.out.print("--------");
        }

        System.out.println();

        // Display column sums
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "\t");
        }

        // Display duplicates
        System.out.println("\n\nDuplicate Found:");
        System.out.println(d);
    }
}