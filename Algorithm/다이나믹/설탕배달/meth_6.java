import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//다이내믹 프로그래밍
public class meth_6 implements DvidStrategy 
{
    @Override 
    public int minbag(int Nkg)
    {        
        Set<Integer> set = new TreeSet<>();
        set.add(0);

        int[] arr=new int[5000];
        Arrays.fill(arr, -1);
        arr[0]=0;

        for(int j=0;j<999;j++)
        {
                        List<Integer> list= new ArrayList<>();

        for(int num : set)
        {

            if(arr[num+3]==-1)
                arr[num+3]=arr[num]+1;
            else
                arr[num+3]=Math.min(arr[num+3],arr[num]+1);
            list.add(num+3);

            if(arr[num+5]==-1)
                arr[num+5]=arr[num]+1;
            else
                arr[num+5]=Math.min(arr[num+5],arr[num]+1);
            list.add(num+5);
         }
         set.removeAll(set);
            set.addAll(list);
            //System.out.println(list);
        }
        return arr[Nkg];
    }
    
}
