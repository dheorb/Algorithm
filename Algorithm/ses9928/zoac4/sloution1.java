public class sloution1 implements strategy{
    @Override
    public int solution(table table)
    {
        for (int i = 0; i < table.raw; i++) {
            for(int j=0; j<table.col; j++)
                {
                    DotCantSit(table,i,j);
                }
        }
        System.out.println("Final count: " + table.count);
        return table.count;
    }

    //a b c d는 주어진 조건과 같음, x y는 현좌표, arr는 테이블, count는 현재 횟수
    public void DotCantSit(table table,int x,int y)
    {
        if(table.arr[x][y]==0)
        {    
            table.count++;
            for (int i = x-table.raw_con; i <= x+table.raw_con; i++) 
            {
            for(int j=y-table.col_con;j<=y+table.col_con;j++)
            {
            if(i>=0 && j>=0 && i<table.raw && j<table.col && table.arr[i][j]!=1)
            {
            table.arr[i][j]=1;
            }
            }
            }
        }
    }
}
