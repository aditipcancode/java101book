public class Example4 {
    public static void main(String[] args) {

        int[] a = new int[10];
        a[1] = 2;
        a[a.length - 1] = 8;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
