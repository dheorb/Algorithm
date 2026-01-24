import java.util.Scanner;

class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int Nkg = sc.nextInt();
        DvidStrategy strategy = new meth_6();
        System.out.println(strategy.minbag(Nkg));
        strategy.minbag(Nkg);
        sc.close();
    }
}   