public class Example5 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i++] +i+ "\t");
        }
        System.out.println("\t");
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[++i] + i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
