
import java.util.Scanner;

class main{
    public static void main(String args[])
    {
        System.out.print("세로크기 가로크기 세로간격 가로간격 순으로 입력하시오 : ");

        Scanner sc=new Scanner(System.in);
        int[] input=new int[4];
        for(int i=0; i<        4; i++)
        {
            input[i]=sc.nextInt();
        }

        strategy st =new sloution1();
        table table= new table(input[0], input[1], input[2], input[3]);
        st.solution(table);
    }
}