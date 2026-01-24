public class Methood_1 implements Strategy {
   @Override
    public int meth(int n)
    {
        int[] arr= new int[10000000];

        for(int num=0;num<10000000;num++)
            arr[num]=-1;


        arr[1]=0;
        for(int i=1;i<=1000000;i++)
        {
            if(arr[i+1]==-1&&i+1<=1000000)
                arr[i+1]=arr[i]+1;
            else if(arr[i+1]!=-1&&i+1<=1000000)
                arr[i+1]=Math.min(arr[i+1],arr[i]+1);

            if(arr[2*i]==-1 && 
                2*i<=1000000)
                arr[2*i]=arr[i]+1;
            else if(arr[2*i]!=-1&&2*i<=1000000)
                arr[2*i]=Math.min(arr[2*i],arr[i]+1);

            if(arr[3*i]==-1&&3*i<=1000000)
                arr[3*i]=arr[i]+1;
            else if(arr[3*i]!=-1&&3*i<=1000000)
                arr[3*i]=Math.min(arr[3*i],arr[i]+1);
        }

        return arr[n];
    }
}