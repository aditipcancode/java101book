public class Example15 {
    public static void main(String[] args) {

        final double RANGE = 200;
        int step = 12, k = 6;
        int[][] a = new int[(int) (RANGE / step)][k];
        for (int i = 0; i < a.length; i++)
            a[i] = new int[2];

    }
}

