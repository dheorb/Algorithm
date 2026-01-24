//전체 탐색
public class meth_4 implements DvidStrategy{
    @Override
    public int minbag(int Nkg)
    {
        int[][] map = new int[100][100];
        int TotalSugar=0;
        map[0][0]=TotalSugar;
        //int currentsugar=0;

        int i = 0;
        int j = 0;
        for (i=0; i < 100; i++) 
        {
            j=0;
            if(i!=0)
                map[j][i]=map[j][i-1]+3;
            for (j=0; j < 100; j++)
            {
                if(j!=0)
                    map[j][i]=map[j-1][i]+5;
                if(map[j][i]==Nkg)
                    return i+j;
            }
        }
        return -1;
    }
    
}
