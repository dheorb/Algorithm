//divide and conquer
public class meth_5 implements DvidStrategy{
    @Override
    public int minbag(int Nkg)
    {
        // 이렇게 리커시브하게 할거면 차라리 맵이나 관계를 만들어서 횟수와 -1을 병렬적으로 처리해야 할것 같다.
        // 횟우와 -1을 같은 선상에서 처리하려고 하니깐 잘 안됨.
        if(Nkg==3||Nkg==5)
            return 1;
        else if(Nkg==1||Nkg==2||Nkg==4)
                return Nkg;
        else 
            return (Math.min(minbag(Nkg-5),minbag(Nkg-3))+1>=Nkg)?-1:Math.min(minbag(Nkg-5),minbag(Nkg-3))+1;
    }
    
}
