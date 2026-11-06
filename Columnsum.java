public class Columnsum {

    public int[] getSum(int[][] a) {

        int[] sum = new int[a[0].length];

        for (int j = 0; j < a[0].length; j++) {

            for (int i = 0; i < a.length; i++) {
                sum[j] += a[i][j];
            }
        }

        return sum;
    }
}