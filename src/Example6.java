public class Example6 {
    public static void main(String[] args) {
        int initial = 3;
        int[] age = {10, 11, 12, 13, 14};
        calculate(initial, age);
        System.out.println(initial);
        showArrayContent(age);
    }

    public static void calculate(int original, int[] ageofman) {
        if (original >= ageofman.length) return;
        for (int i = original; i < ageofman.length; i++) {
            ageofman[i] = ageofman[ageofman.length - i];
        }
        original = 0;
    }

    public static void showArrayContent(int[] a) {

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

    }
}

