public class Example15 {
        public static void f()
        {
            System.out.println("A");
        }
        public static void f(int a, int b)
        {
            System.out.println("B");
        }
        public static void f(float a, float b)
        {
            System.out.println("C");
        }
        public static void f(double a, double b)
        {
            System.out.println("D");
        }
        public static void f(char a, char b)
        {
            System.out.println("E");
        }
        public static void main(String[] args)
        {
            f();
            f(1,2);
            f(1.0,2.0);
            f(1,2.0);
            f(1F,2.0);
            f('1','2');
            f('1',2);
        }
    }

