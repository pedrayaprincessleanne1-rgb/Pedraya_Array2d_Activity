public class Rowsum {

    public int[] getSum(int[][] a) {

        int[] sum = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                sum[i] += a[i][j];
            }
        }

        return sum;
    }
}