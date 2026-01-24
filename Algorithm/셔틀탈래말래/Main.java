import java.util.Scanner;

class Main
{   
public static void main(String[] args)
{
    Scanner sc =new Scanner(System.in);
    int BusEta=sc.nextInt();
    int SpendByBus=sc.nextInt();
    int LegToArrival=sc.nextInt();
    int DeadLine=sc.nextInt();
    int BusToArrival=BusEta+SpendByBus;

    LateCalculater(BusEta,SpendByBus,LegToArrival,DeadLine);
    sc.close();
}
    public static  void LateCalculater(int BusEta,int SpendByBus,int LegToArrival,int DeadLine)
    {
    int BusToArrival=BusEta+SpendByBus;
    boolean Run=false,Wait=false,Dead=true,Good=false;

    if(DeadLine>=BusToArrival)
    {
        Wait=true;
    }
    if(DeadLine>=LegToArrival)
    {
        Run=true;
    }
    if(Wait&&Run)
    {
        Good=true;
    }

    if(Good)
        System.out.println("~.~");
    else if(Wait)
        System.out.println("shuttle");
    else if(Run)
        System.out.println("Walk");
    else if(Dead)
        System.out.println("T.T");
    }

}