import java.util.Scanner;
class Main{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int CaseNum = sc.nextInt();
            NM[] CaseInput = new NM[CaseNum];
            for(int i=0;i<CaseNum;i++)
            {
                CaseInput[i]=new NM();
                CaseInput[i].n=sc.nextInt();
                CaseInput[i].m=sc.nextInt();
            }

            stratagy st= new MtStratagy();
            st.WhoAmI();

            for(NM i:CaseInput)
            {
                System.out.println(st.solution(i.n,i.m));
            }
        }
}