public class Example10 {
    public static void main(String[] args) {

        int[] a = {87, 78, 90, 4, 54, 1, 23, 12, 32};

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");


        a = Sort(a);
        System.out.println("");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");
    }

    public static int[] Sort(int[] b) {
        int max = 0;
        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j < b.length ; j++) {
                if (b[i] < b[j]) {
                    max = b[i];
                    b[i] = b[j];
                    b[j] = max;
                }
            }
        }
        return b;
    }
}




