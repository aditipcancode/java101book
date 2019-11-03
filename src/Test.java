public class Test {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        /*for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                System.out.println(a[i]);
            }


        }*/
        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                a[i] = a[i]+i*5;
                System.out.println("numbr at odd place  = " + a[i]);
            }
        }
    }
}
