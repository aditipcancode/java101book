public class Example7 {
    public static void main(String[] args)
    {
        int [] a={10,20,30};

        System.out.println(sum(a));
    }


    public static int sum(int [] b)
    {

        int sum=0;
        for(int i = 0; i<b.length; i++)
        {
            sum=sum+b[i];
        }
        return sum;
    }
}
