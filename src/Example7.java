public class Example7 {
    public static void main(String[] args)
    { int n = 0;
        for(int i=0;i<5;i++){
            n = f(++n);
        }
        System.out.println(n);
    }
    public static int f(int n)
    {
        return ++n;
    }
}
