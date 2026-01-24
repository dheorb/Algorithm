//조건 분기
public class meth_2 implements DvidStrategy{
    @Override
    public int minbag(int Nkg)
    {
        int minBagNum = Nkg / 5;
        int rest = Nkg % 5;

        if(rest==0)
            return minBagNum;
        else if(rest==1&&Nkg>5)
            return minBagNum+1;
        else if(rest==1&&Nkg<5)
             return -1;
        else if(rest==2&&Nkg>10)
            return minBagNum+2;
        else if(rest==2&&Nkg<10)
            return -1;
        else if(rest==3)
            return minBagNum+1;
        else if(rest==4&&Nkg>5)
            return minBagNum+2;
        else if(rest==4&&Nkg<5)
            return -1;
        return-1;
    }
}