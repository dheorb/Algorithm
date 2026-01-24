//그리디 알고리즘
public class meth_3 implements DvidStrategy{
   @Override
    public int minbag(int Nkg)
    {
        int minBagNum=0;
        int TotalSugar=0;
        boolean run=true;
        boolean Shrink=true;

        minBagNum=Nkg/5;
        TotalSugar=minBagNum*5;
        if(Nkg%5==0)
            return minBagNum;

        int i=0;
        TotalSugar=TotalSugar+5;
        minBagNum++;
        while(run)
        {
            if(Shrink)
                {
                    TotalSugar=TotalSugar-5;
                    minBagNum--;
                    i++;
                }
            if((Nkg-TotalSugar)%3==0)
                return minBagNum+(Nkg-TotalSugar)/3;
            if(i>2|| TotalSugar<=0)
                run=false;
        }
        return -1;
    }

    
}
