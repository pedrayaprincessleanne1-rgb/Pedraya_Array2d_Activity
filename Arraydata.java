import java.util.Scanner;

public class Arraydata {

    public int[][] getArray(int r, int c) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[r][c];

        System.out.print("Enter elements: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        return a;
    }
}