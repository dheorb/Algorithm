public class table {
    public int raw;
    public int col;
    public int raw_con;
    public int col_con;
    public int[][] arr;
    public int count;

    public table(int raw, int col,int raw_con,int col_con)
    {
        this.raw=raw;
        this.col=col;
        this.raw_con=raw_con;
        this.col_con=col_con;
        count=0;
        arr = new int[raw][col];
        for(int i=0;i<raw;i++)
            for(int j=0;j<col;j++)
                arr[i][j]=0;
    }
}
