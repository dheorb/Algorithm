

public class meth_1 implements DvidStrategy{

    private int minBagNum;
    private  int rest;
    private int rest5;
    @Override
    public int minbag(int Nkg)
    {
    minBagNum = Nkg / 5;
    rest = Nkg % 5;
    rest5=0;

        if(rest==0)
            return minBagNum;
        else
        {
            rest5=rest%3;
            if(rest5==0)
            return minBagNum+1;
              else
                {
                rest5 = (rest+5) % 3;
                if(rest5==0)
                    return minBagNum-1+(rest+5)/3;
                else{
                    rest5=(rest+10)%3;
                    if(rest5==0)
                        return minBagNum-2+(rest+10)/3;
                }
            }
        }
/*
        boolean Dibided5 = false;
        boolean Dibided5_1 =false;
        boolean Dibided5_2 = false;
*/
        return -1;
    }
    
}
