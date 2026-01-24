public class MtStratagy implements stratagy {
    @Override
    public int solution(int n,int m)
    {
        return combination(n, m);
    }
    @Override
    public void WhoAmI()
    {
        System.out.println("MathStrtagy");
    }
    
    public int factorial(int n)
    {
        if(n==0)
            return 1;
        int i=1;
        for(int j=1;j<=n;j++)
        {
            i=i*j;
        }
        return i;
    }

    public int combination(int n,int m)
    {
        if(n==m)
            return 1;

        int i=1;
        for(int j=m;j>m-n;j--)
        {
            i=i*j;
        }
        return i/factorial(n);
    }
}